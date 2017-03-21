package com.papinotas.trainingbattle.db.models;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

/**
 * Created by tecnomei on 08-03-17.
 */

public class Register {
    private long idUser;
    private long dateTimeMillis;
    private long idExercise;

    public Register(long dateTimeMillis, long idExercise, int quantity) {
        this.dateTimeMillis = dateTimeMillis;
        this.idExercise = idExercise;
        this.quantity = quantity;
    }

    private int quantity;

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public long getDateTimeMillis() {
        return dateTimeMillis;
    }

    public void setDateTimeMillis(long dateTimeMillis) {
        this.dateTimeMillis = dateTimeMillis;
    }

    public long getIdExercise() {
        return idExercise;
    }

    public void setIdExercise(long idExercise) {
        this.idExercise = idExercise;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDay() {
        return String.valueOf(getDateTime().getDayOfMonth());
    }

    private DateTime getDateTime() {
        return new DateTime(dateTimeMillis);
    }

    public String getMonth() {
        return String.valueOf(getDateTime().toString("MMM"));
    }


    public String getHour() {
        return String.valueOf(getDateTime().toString("hh:mm:ss a"));
    }
}
