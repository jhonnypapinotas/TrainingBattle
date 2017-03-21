package com.papinotas.trainingbattle.presenters;

import com.papinotas.trainingbattle.interfaces.IProfileView;
import com.papinotas.trainingbattle.db.interactors.UserInteractor;

/**
 * Created by tecnomei on 02-03-17.
 */
public class ProfilePresenter {
    private UserInteractor userInteractor;

    public void loadUserDate(IProfileView view) {
        this.userInteractor=new UserInteractor();
        view.setName(userInteractor.getLoggedUsername());
        view.setEmail(userInteractor.getLoggedEmail());
        view.setPhoto(userInteractor.getLoggedPhoto());
        view.setBackground(userInteractor.getLoggedPhoto());
    }
}