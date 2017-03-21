package com.papinotas.trainingbattle.views.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.github.jhonnyx2012.horizontalpicker.DatePickerListener;
import com.github.jhonnyx2012.horizontalpicker.HorizontalPicker;
import com.papinotas.trainingbattle.R;
import com.papinotas.trainingbattle.db.models.Exercise;
import com.papinotas.trainingbattle.interfaces.IMainView;
import com.papinotas.trainingbattle.interfaces.IProfileView;
import com.papinotas.trainingbattle.presenters.MainViewPresenter;
import com.papinotas.trainingbattle.presenters.ProfilePresenter;
import com.papinotas.trainingbattle.views.adapters.ExerciseAdapter;
import com.papinotas.trainingbattle.views.adapters.ViewPagerAdapter;
import com.papinotas.trainingbattle.views.fragments.FragmentRegister;

import org.joda.time.DateTime;

import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;
import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.CropCircleTransformation;

public class MainActivity extends AppCompatActivity implements IMainView,IProfileView, DatePickerListener, AdapterView.OnItemSelectedListener {
    private static final String REGISTER_TITLE = "Registro";
    private static final String RANKING_TITLE = "Ranking";
    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.tabs) TabLayout tabs;
    @BindView(R.id.collapsingToolbar) CollapsingToolbarLayout collapsingToolbar;
    @BindView(R.id.spExercices) Spinner spExercices;
    @BindView(R.id.viewPager) ViewPager viewPager;
    @BindView(R.id.tvName) TextView tvName;
    @BindView(R.id.tvEmail) TextView tvEmail;
    @BindView(R.id.ivBackground) ImageView ivBackground;
    @BindView(R.id.ivPhoto) ImageView ivPhoto;

    private MainViewPresenter mainPresenter;
    private ProfilePresenter profilePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        spExercices.setOnItemSelectedListener(this);
        mainPresenter=new MainViewPresenter();
        profilePresenter=new ProfilePresenter();
        mainPresenter.onCreate(this);
        profilePresenter.loadUserDate(this);
        HorizontalPicker picker= (HorizontalPicker) findViewById(R.id.datePicker);
        picker
                .setListener(this)
                .init();
    }

    @Override
    public void showSpinnerExercises(ArrayList<Exercise> exercises) {
        spExercices.setAdapter(new ExerciseAdapter(this,exercises));
    }

    @Override
    public void initPager(int idExercise) {
        tabs.setupWithViewPager(viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(FragmentRegister.newInstance(idExercise), REGISTER_TITLE);
        adapter.addFrag(FragmentRegister.newInstance(idExercise), RANKING_TITLE);
        viewPager.setAdapter(adapter);
    }

    @Override
    public void setName(String value) {
        tvName.setText(value);
        collapsingToolbar.setTitle(value);
    }

    @Override
    public void setEmail(String value) {
        tvEmail.setText(value);
    }

    @Override
    public void setPhoto(String value) {
        Glide.with(this).load(R.drawable.header)
                .bitmapTransform(new CropCircleTransformation(this))
                .into(ivPhoto);
    }

    @Override
    public void setBackground(String value) {
        Glide.with(this).load(R.drawable.header)
                .bitmapTransform(new BlurTransformation(this))
                .into(ivBackground);
    }

    @Override
    public void onDateSelected(DateTime dateSelected) {
        Log.i("HorizontalPicker","Fecha seleccionada="+dateSelected.toString());
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        mainPresenter.onExerciseSelected(((ExerciseAdapter)spExercices.getAdapter()).getItem(position).getId(), position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {}
}