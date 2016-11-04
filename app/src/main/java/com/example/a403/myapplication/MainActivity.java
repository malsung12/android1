package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (button)finviewById(R.id.button2);
        b1.setonClickListener*(new View.OnClickListener() {
            @Override
            public void onClice(View)
        }

    }
}
