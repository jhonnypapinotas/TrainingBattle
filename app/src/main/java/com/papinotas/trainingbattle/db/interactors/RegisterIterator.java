package com.papinotas.trainingbattle.db.interactors;

import com.papinotas.trainingbattle.db.models.Exercise;
import com.papinotas.trainingbattle.db.models.Register;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Created by tecnomei on 09-03-17.
 */

public class RegisterIterator {
    public ArrayList<Register> getRegister(String loggedEmail,int idExercise) {
        ArrayList<Register> list=new ArrayList<>();
        switch (idExercise){
            case Exercise.ID_PUSH_UP:
                list.add(new Register(new DateTime().plusDays(0).getMillis(), Exercise.ID_PUSH_UP,34));
                list.add(new Register(new DateTime().plusDays(0).getMillis(), Exercise.ID_PUSH_UP,45));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_PUSH_UP,34));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_PUSH_UP,344));
                list.add(new Register(new DateTime().plusDays(3).getMillis(), Exercise.ID_PUSH_UP,3));
                list.add(new Register(new DateTime().plusDays(3).getMillis(), Exercise.ID_PUSH_UP,34));
                list.add(new Register(new DateTime().plusDays(4).getMillis(), Exercise.ID_PUSH_UP,34));
                list.add(new Register(new DateTime().plusDays(5).getMillis(), Exercise.ID_PUSH_UP,3));
                list.add(new Register(new DateTime().plusDays(6).getMillis(), Exercise.ID_PUSH_UP,34));
                list.add(new Register(new DateTime().plusDays(6).getMillis(), Exercise.ID_PUSH_UP,34));
                list.add(new Register(new DateTime().plusDays(7).getMillis(), Exercise.ID_PUSH_UP,3));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_PUSH_UP,34));
                list.add(new Register(new DateTime().plusDays(4).getMillis(), Exercise.ID_PUSH_UP,2));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_PUSH_UP,76));break;
            case Exercise.ID_PARACAIDAS:
                list.add(new Register(new DateTime().plusDays(0).getMillis(), Exercise.ID_PARACAIDAS,34));
                list.add(new Register(new DateTime().plusDays(0).getMillis(), Exercise.ID_PARACAIDAS,45));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_PARACAIDAS,34));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_PARACAIDAS,344));
                list.add(new Register(new DateTime().plusDays(3).getMillis(), Exercise.ID_PARACAIDAS,3));
                list.add(new Register(new DateTime().plusDays(3).getMillis(), Exercise.ID_PARACAIDAS,34));
                list.add(new Register(new DateTime().plusDays(4).getMillis(), Exercise.ID_PARACAIDAS,34));break;
            case Exercise.ID_SENTADILLAS:
                list.add(new Register(new DateTime().plusDays(0).getMillis(), Exercise.ID_SENTADILLAS,34));
                list.add(new Register(new DateTime().plusDays(0).getMillis(), Exercise.ID_SENTADILLAS,45));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_SENTADILLAS,34));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_SENTADILLAS,344));
                list.add(new Register(new DateTime().plusDays(3).getMillis(), Exercise.ID_SENTADILLAS,3));
                list.add(new Register(new DateTime().plusDays(3).getMillis(), Exercise.ID_SENTADILLAS,34));
                list.add(new Register(new DateTime().plusDays(4).getMillis(), Exercise.ID_SENTADILLAS,34));
                list.add(new Register(new DateTime().plusDays(0).getMillis(), Exercise.ID_SENTADILLAS,34));
                list.add(new Register(new DateTime().plusDays(0).getMillis(), Exercise.ID_SENTADILLAS,45));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_SENTADILLAS,34));
                list.add(new Register(new DateTime().plusDays(2).getMillis(), Exercise.ID_SENTADILLAS,344));
                list.add(new Register(new DateTime().plusDays(3).getMillis(), Exercise.ID_SENTADILLAS,3));
                list.add(new Register(new DateTime().plusDays(3).getMillis(), Exercise.ID_SENTADILLAS,34));
                list.add(new Register(new DateTime().plusDays(4).getMillis(), Exercise.ID_SENTADILLAS,34));break;
        }
        return list;
    }
}
