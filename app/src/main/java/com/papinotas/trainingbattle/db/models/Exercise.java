package com.papinotas.trainingbattle.db.models;

import com.papinotas.trainingbattle.views.adapters.ExerciseAdapter;

/**
 * Created by tecnomei on 09-03-17.
 */

public class Exercise {
    public static final int ID_PUSH_UP = 0;
    public static final int ID_SENTADILLAS = 1;
    public static final int ID_PARACAIDAS = 2;

    public Exercise(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
