package com.papinotas.trainingbattle.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.papinotas.trainingbattle.R;
import com.papinotas.trainingbattle.db.models.Register;
import com.papinotas.trainingbattle.interfaces.IRegisterView;
import com.papinotas.trainingbattle.presenters.RegisterPresenter;
import com.papinotas.trainingbattle.views.adapters.RegisterAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tecnomei on 01-03-17.
 */

public class FragmentRegister extends Fragment implements IRegisterView{
    @BindView(R.id.rvList)
    RecyclerView rvList;
    private RegisterPresenter presenter;
    private int idExercise;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_register,container,false);
        ButterKnife.bind(this,view);
        presenter=new RegisterPresenter();
        presenter.onCreateView(this,idExercise);
        return view;
    }

    @Override
    public void setUpList(ArrayList<Register> list) {
        rvList.setAdapter(new RegisterAdapter(list));
        rvList.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    public static FragmentRegister newInstance(int idExercise) {
        FragmentRegister fragment = new FragmentRegister();
        fragment.setIdExercise(idExercise);
        return fragment;
    }

    public void setIdExercise(int idExercise) {
        this.idExercise = idExercise;
    }
}
