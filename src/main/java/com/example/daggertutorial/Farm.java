package com.example.daggertutorial;

import javax.inject.Inject;

public class Farm {
    @Inject
    public Farm() {
    }

    public String getBeans(){
        return "Beans";
    }
}
