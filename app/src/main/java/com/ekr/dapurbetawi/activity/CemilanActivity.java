package com.ekr.dapurbetawi.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.ekr.dapurbetawi.R;
import com.ekr.dapurbetawi.adapter.CemilanAdapter;
import com.ekr.dapurbetawi.adapter.ResepAdapter;
import com.ekr.dapurbetawi.data.CemilanData;
import com.ekr.dapurbetawi.data.ResepData;
import com.ekr.dapurbetawi.model.CemilanModel;
import com.ekr.dapurbetawi.model.ResepModel;

import java.util.ArrayList;

public class CemilanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<CemilanModel> cemilanModels = new ArrayList<>();
    private SearchView searchView;
    private CemilanAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cemilan);
        searchView = findViewById(R.id.search_cemilan);
        recyclerView = findViewById(R.id.rcv_cemilan);
        setupRcvWisata();
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

    private void setupRcvWisata() {
        cemilanModels.addAll(CemilanData.getListData());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CemilanAdapter(cemilanModels, getApplicationContext());
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(position -> {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.ITEM_EXTRA_CEMILAN, cemilanModels.get(position));
            startActivity(intent);
        });
    }
}