package com.eveliinaheino.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ennenUnta(View view){
        Intent intent = new Intent(this, EnnenUntaActivity.class);
        startActivity(intent);
    }

    public void unenJalkeen(View view){
        Intent intent = new Intent(this, UnenJalkeenActivity.class);
        startActivity(intent);
    }

    public void tarkasteleTietoja(View view){
        Intent intent = new Intent(this, TarkasteleTietojaActivity.class);
        startActivity(intent);
    }

    public void vinkit(View view){
        Intent intent = new Intent(this, VinkitActivity.class);
        startActivity(intent);
    }
}