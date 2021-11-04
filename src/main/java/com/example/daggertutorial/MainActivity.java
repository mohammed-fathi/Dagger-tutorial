package com.example.daggertutorial;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    Caffee caffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     CoffeeComponent component = DaggerCoffeeComponent.create();
     component.inject(this);
        Log.d(TAG, "mohammed onCreate: " +caffee.GetCoffeeCup());

    }
}