package com.example.daggertutorial;

import android.util.Log;

import javax.inject.Inject;



public class Caffee {
    private static final String TAG = "Caffee";
    @Inject
    Farm farm;
    @Inject
    River river;

    @Inject
    public Caffee() {
    }

    @Inject
    public void connectElectricity(){
        Log.d(TAG, "connectElectricity: Connectind .....");
    }
    public String GetCoffeeCup(){
        return farm.getBeans() + "+" + river.getWater();
    }
}
