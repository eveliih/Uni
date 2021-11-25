package com.eveliinaheino.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class VinkitActivity extends AppCompatActivity {
    List <String> vinkit = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinkit);

        vinkit.add("Riittävä uni");
        vinkit.add("Rutiinit");
        vinkit.add("Unihygienia");
        vinkit.add("Ärsykehallinta");
        vinkit.add("Omat vinkit");

        final ListView listViewVinkit = findViewById(R.id.listViewUniVinkit);
        listViewVinkit.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                vinkit)
        );


    }
}