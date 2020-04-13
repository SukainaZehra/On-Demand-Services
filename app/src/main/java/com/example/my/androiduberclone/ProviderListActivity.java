package com.example.my.androiduberclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ProviderListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_list);
        RecyclerView providerList = (RecyclerView) findViewById(R.id.providerlist);
        providerList.setLayoutManager(new LinearLayoutManager(this));
        String[] language = {"Arif", "Asim", "Asad", "Arib", "Atif", "Abdul", "Asfar"};
        providerList.setAdapter(new ProviderListAdapter(language));

    }
}
