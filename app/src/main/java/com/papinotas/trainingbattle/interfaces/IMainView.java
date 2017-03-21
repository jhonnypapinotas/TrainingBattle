package com.papinotas.trainingbattle.interfaces;

import com.papinotas.trainingbattle.db.models.Exercise;
import com.papinotas.trainingbattle.views.adapters.ExerciseAdapter;
import com.papinotas.trainingbattle.views.adapters.RegisterAdapter;
import com.papinotas.trainingbattle.views.adapters.ViewPagerAdapter;

import java.util.ArrayList;

/**
 * Created by tecnomei on 01-03-17.
 */

public interface IMainView {
    void showSpinnerExercises(ArrayList<Exercise> exercises);
    void initPager(int idExercise);
}