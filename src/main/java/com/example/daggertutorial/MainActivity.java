package com.example.daggertutorial;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     CoffeeComponent component = DaggerCoffeeComponent.create();
     component.getCoffee();
    }
}