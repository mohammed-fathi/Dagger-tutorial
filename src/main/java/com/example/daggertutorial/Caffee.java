package com.example.daggertutorial;

import javax.inject.Inject;

public class Caffee {
    @Inject
    Farm farm;
    @Inject
    River river;

    @Inject
    public Caffee() {
    }
    public String GetCoffeeCup(){
        return farm.getBeans() + "+" + river.getWater();
    }
}
