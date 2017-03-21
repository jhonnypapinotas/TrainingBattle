package com.papinotas.trainingbattle.db.interactors;

import com.papinotas.trainingbattle.db.models.Exercise;

import java.util.ArrayList;

/**
 * Created by tecnomei on 02-03-17.
 */
public class ExerciseInteractor {
    public ArrayList<Exercise> getExercises() {
        ArrayList<Exercise> exercises=new ArrayList<>();
        exercises.add(new Exercise("PushUps",Exercise.ID_PUSH_UP));
        exercises.add(new Exercise("Sentadillas",Exercise.ID_SENTADILLAS));
        exercises.add(new Exercise("Paracaidas",Exercise.ID_PARACAIDAS));
        return exercises;
    }
}
