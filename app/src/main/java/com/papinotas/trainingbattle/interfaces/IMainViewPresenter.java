package com.papinotas.trainingbattle.interfaces;

import com.papinotas.trainingbattle.views.adapters.ExerciseAdapter;
import com.papinotas.trainingbattle.views.adapters.ViewPagerAdapter;

/**
 * Created by tecnomei on 01-03-17.
 */

public interface IMainViewPresenter {
    void setSpinnerAdapter(ExerciseAdapter adapter);
    void initPager(ViewPagerAdapter adapter);
}