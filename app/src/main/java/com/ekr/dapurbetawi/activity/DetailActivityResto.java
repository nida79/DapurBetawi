package com.ekr.dapurbetawi.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ekr.dapurbetawi.GlideHelper;
import com.ekr.dapurbetawi.R;
import com.ekr.dapurbetawi.model.RestoModel;

public class DetailActivityResto extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
    private TextView textView_alamat, textView_deskripsi, textView_jam, textView_judul;
    private ImageView imageView_resto, imageView_back, imageView_share, imageView_map;
    String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    private Uri gmmIntentUri;
    private Intent mapIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resto);
        initialize();
    }

    @SuppressLint("QueryPermissionsNeeded")
    private void initialize() {
        textView_alamat = findViewById(R.id.alamat_detail_resto);
        textView_deskripsi = findViewById(R.id.deskripsi_detail_resto);
        textView_jam = findViewById(R.id.waktu_detail_resto);
        textView_judul = findViewById(R.id.judul_detail_resto);
        imageView_resto = findViewById(R.id.img_detail_resto);
        imageView_back = findViewById(R.id.btn_back_detail_resto);
        imageView_share = findViewById(R.id.btn_share);
        imageView_map = findViewById(R.id.btn_map);
        imageView_back.setOnClickListener(view -> finish());
        RestoModel data = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (data != null) {
            // menyambungkan data dari activity sebelum nya ke view halaman detail
            GlideHelper.SetImage(getApplicationContext(), data.getImage(), imageView_resto);
            textView_judul.setText(data.getJudul());
            textView_deskripsi.setText(data.getDeskripsi());
            textView_jam.setText(data.getWaktu());
            textView_alamat.setText(data.getAlamat());
            imageView_map.setOnClickListener(view -> {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = (Uri) Uri.parse("google.navigation:q=" + data.getLatlong());
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(this, "Google Maps Belum Terinstal, Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            });
            imageView_share.setOnClickListener(view -> {
                shareTextUrl(data.getJudul(),data.getAlamat());
            });
        }
    }
    private void shareTextUrl(String judul,String alamat) {
        Intent share = new Intent(android.content.Intent.ACTION_SEND);
        share.setType("text/plain");
        share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
        // Add data to the intent, the receiving app will decide
        // what to do with it.
        share.putExtra(Intent.EXTRA_SUBJECT, judul);
        share.putExtra(Intent.EXTRA_TEXT, alamat);
        startActivity(Intent.createChooser(share, "Bagikan Alamat Resto!"));
    }

}