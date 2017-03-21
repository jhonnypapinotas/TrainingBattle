package com.papinotas.trainingbattle.presenters;

import com.papinotas.trainingbattle.db.interactors.RegisterIterator;
import com.papinotas.trainingbattle.db.interactors.UserInteractor;
import com.papinotas.trainingbattle.db.models.Exercise;
import com.papinotas.trainingbattle.interfaces.IRegisterView;
import com.papinotas.trainingbattle.views.fragments.FragmentRegister;

/**
 * Created by tecnomei on 08-03-17.
 */

public class RegisterPresenter {
    private UserInteractor userInteractor;
    private RegisterIterator registerIterator;
    public void onCreateView(IRegisterView view, int idExercise) {
        userInteractor=new UserInteractor();
        registerIterator=new RegisterIterator();
        view.setUpList(registerIterator.getRegister(userInteractor.getLoggedEmail(), idExercise));
    }
}