package com.example.ilhamakbar.ilham_1202154193_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    TextView tTempat, tMenu, tPorsi, tHarga;
    String get_menu, get_nama;
    Integer get_porsi, get_total;

    @Override
    protected void onCreate(Bundle savedInt) {
        super.onCreate(savedInt);
        setContentView(R.layout.activity_main2);

        tTempat = (TextView) findViewById(R.id.text_tempat);
        tMenu = (TextView) findViewById(R.id.text_menu);
        tPorsi = (TextView) findViewById(R.id.text_porsi);
        tHarga = (TextView) findViewById(R.id.text_harga);

        Bundle a = getIntent().getExtras();
        Bundle e = getIntent().getExtras();

        get_menu = a.getString("parse_menu");
        get_porsi = a.getInt("parse_porsi");
        get_menu = e.getString("parse_menu");
        get_porsi = e.getInt("parse_porsi");
        get_total = a.getInt("parse_total");
        get_total = e.getInt("parse_total");
        get_nama = a.getString("parse_nama");
        get_nama = e.getString("parse_nama");

        tMenu.setText(get_menu);
        tPorsi.setText(String.valueOf(get_porsi));
        tHarga.setText(String.valueOf(get_total));
        tTempat.setText(get_nama);
    }

}
