package com.papinotas.trainingbattle.presenters;

import com.papinotas.trainingbattle.interfaces.IMainView;
import com.papinotas.trainingbattle.db.interactors.ExerciseInteractor;
import com.papinotas.trainingbattle.views.adapters.ExerciseAdapter;

/**
 * Created by tecnomei on 02-03-17.
 */
public class MainViewPresenter {
    private static final int INITIAL_PAGER_POSITION = 0;
    private IMainView view;
    private ExerciseInteractor exerciseInteractor;

    public void onCreate(IMainView view) {
        this.view=view;
        this.exerciseInteractor=new ExerciseInteractor();
        view.initPager(INITIAL_PAGER_POSITION);
        view.showSpinnerExercises(exerciseInteractor.getExercises());
    }

    public void onExerciseSelected(int item, int position) {
        view.initPager(item);
    }
}