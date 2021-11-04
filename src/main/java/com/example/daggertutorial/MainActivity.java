package com.example.daggertutorial;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Farm farm = new Farm();
        River river = new River();
        Caffee caffee = new Caffee(farm , river);
    }
}