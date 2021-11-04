package com.example.daggertutorial;

import javax.inject.Inject;

public class Caffee {
    private Farm farm;
    private River river;

    @Inject
    public Caffee(Farm farm, River river) {
        this.farm = farm;
        this.river = river;
    }
}
