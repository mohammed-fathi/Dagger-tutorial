package com.example.daggertutorial;

import dagger.Component;

@Component
public interface CoffeeComponent {

    Caffee getCoffee();

    void inject(MainActivity mainActivity);
}
