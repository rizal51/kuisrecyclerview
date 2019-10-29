package com.example.kuisrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Bejo Budiono", "Ayah", getDrawable(R.drawable.bapak)));
        keluargaArrayList.add(new Keluarga("Winta Hariyati", "Ibu", getDrawable(R.drawable.ibu)));
        keluargaArrayList.add(new Keluarga("Rika Wahyuningtyas P", "Kakak", getDrawable(R.drawable.rika)));
        keluargaArrayList.add(new Keluarga("Rizal Wahyudi", "Anak", getDrawable(R.drawable.profil)));
        keluargaArrayList.add(new Keluarga("Moh Khozin Maulana", "Adik", getDrawable(R.drawable.lana)));
    }
}
