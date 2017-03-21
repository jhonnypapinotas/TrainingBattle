package com.papinotas.trainingbattle.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by tecnomei on 06-03-17.
 */

@Database(name = DB.NAME, version = DB.VERSION)
public class DB {
    public static final String NAME = "TrainingBattle"; // we will add the .db extension
    public static final int VERSION = 1;
}