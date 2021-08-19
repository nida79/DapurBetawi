package com.ekr.dapurbetawi.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.ekr.dapurbetawi.R;
import com.ekr.dapurbetawi.adapter.ResepAdapter;
import com.ekr.dapurbetawi.adapter.RestoAdapter;
import com.ekr.dapurbetawi.data.ResepData;
import com.ekr.dapurbetawi.data.RestoData;
import com.ekr.dapurbetawi.model.ResepModel;
import com.ekr.dapurbetawi.model.RestoModel;

import java.util.ArrayList;

public class RestoActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<RestoModel> restoModels = new ArrayList<>();
    private SearchView searchView;
    private RestoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);
        recyclerView = findViewById(R.id.rcv_resto);
        searchView = findViewById(R.id.search_resto);
        //setup recyclerview (data2 / list dari resto yang tadi sudah di sambunngkan)
        setUpRCVResto();
        cariData();
    }

    private void cariData() {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (adapter != null) {
                    adapter.getFilter().filter(newText);
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Data Tidak Ditemukan", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }

    private void setUpRCVResto() {
        restoModels.addAll(RestoData.getListData());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RestoAdapter(restoModels, getApplicationContext());
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(position -> {
            // untuk berpindah ke halaman detail sekaligus mengirim data ke halaman detail
            Intent intent = new Intent(this, DetailActivityResto.class);
            intent.putExtra(DetailActivityResto.ITEM_EXTRA, restoModels.get(position));
            startActivity(intent);
        });
    }
}