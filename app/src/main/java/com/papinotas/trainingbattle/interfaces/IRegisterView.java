package com.papinotas.trainingbattle.interfaces;

import com.papinotas.trainingbattle.db.models.Register;
import com.papinotas.trainingbattle.views.adapters.RegisterAdapter;

import java.util.ArrayList;

/**
 * Created by tecnomei on 01-03-17.
 */

public interface IRegisterView {
    void setUpList(ArrayList<Register> list);
    //void showList(boolean show);
}