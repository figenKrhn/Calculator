package com.example.wn81.calculator;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    String sayi1, sayi2;
    int x, y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText etSayiBir = (EditText) findViewById(R.id.editText);
        EditText etSayiİki = (EditText) findViewById(R.id.editText2);
        TextView tvView = (TextView) findViewById(R.id.textView);


    }


    public void bolme(View view) {
        EditText etSayiBir = (EditText) findViewById(R.id.editText);
        EditText etSayiİki = (EditText) findViewById(R.id.editText2);
        TextView tvView = (TextView) findViewById(R.id.textView);
        sayi1 = etSayiBir.getText().toString();
        sayi2 = etSayiİki.getText().toString();

        try {
            if (sayi1.isEmpty() || sayi2.isEmpty()) {
                Toast.makeText(getApplication(), "Sayı girişi yapmadınız", Toast.LENGTH_LONG).show();
            } else {
                x = Integer.valueOf(sayi1);
                y = Integer.valueOf(sayi2);
                tvView.setText(x / y + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplication(), "Bir Hata oluştu Tekrar deneyiniz", Toast.LENGTH_LONG).show();
        }
    }

    public void carpma(View view) {
        EditText etSayiBir = (EditText) findViewById(R.id.editText);
        EditText etSayiİki = (EditText) findViewById(R.id.editText2);
        TextView tvView = (TextView) findViewById(R.id.textView);
        sayi1 = etSayiBir.getText().toString();
        sayi2 = etSayiİki.getText().toString();

        try {
            if (sayi1.isEmpty() || sayi2.isEmpty()) {
                Toast.makeText(getApplication(), "Sayı girişi yapmadınız", Toast.LENGTH_LONG).show();
            } else {
                x = Integer.valueOf(sayi1);
                y = Integer.valueOf(sayi2);
                tvView.setText(x * y + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplication(), "Bir Hata oluştu Tekrar deneyiniz", Toast.LENGTH_LONG).show();
        }


    }

    public void cıkarma(View view) {
        EditText etSayiBir = (EditText) findViewById(R.id.editText);
        EditText etSayiİki = (EditText) findViewById(R.id.editText2);
        TextView tvView = (TextView) findViewById(R.id.textView);
        sayi1 = etSayiBir.getText().toString();
        sayi2 = etSayiİki.getText().toString();

        try {
            if (sayi1.isEmpty() || sayi2.isEmpty()) {
                Toast.makeText(getApplication(), "Sayı girişi yapmadınız", Toast.LENGTH_LONG).show();
            } else {
                x = Integer.valueOf(sayi1);
                y = Integer.valueOf(sayi2);
                tvView.setText(x - y + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplication(), "Bir Hata oluştu Tekrar deneyiniz", Toast.LENGTH_LONG).show();
        }
    }

    public void topla(View view) {
        EditText etSayiBir = (EditText) findViewById(R.id.editText);
        EditText etSayiİki = (EditText) findViewById(R.id.editText2);
        TextView tvView = (TextView) findViewById(R.id.textView);
        sayi1 = etSayiBir.getText().toString();
        sayi2 = etSayiİki.getText().toString();

        try {
            if (sayi1.isEmpty() || sayi2.isEmpty()) {
                Toast.makeText(getApplication(), "Sayı girişi yapmadınız", Toast.LENGTH_LONG).show();
            } else {
                x = Integer.valueOf(sayi1);
                y = Integer.valueOf(sayi2);
                tvView.setText(x + y + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplication(), "Bir Hata oluştu Tekrar deneyiniz", Toast.LENGTH_LONG).show();
        }
    }

    public void mod(View view) {
        EditText etSayiBir = (EditText) findViewById(R.id.editText);
        EditText etSayiİki = (EditText) findViewById(R.id.editText2);
        TextView tvView = (TextView) findViewById(R.id.textView);
        sayi1 = etSayiBir.getText().toString();
        sayi2 = etSayiİki.getText().toString();

        try {
            if (sayi1.isEmpty() || sayi2.isEmpty()) {
                Toast.makeText(getApplication(), "Sayı girişi yapmadınız", Toast.LENGTH_LONG).show();
            } else {
                x = Integer.valueOf(sayi1);
                y = Integer.valueOf(sayi2);
                tvView.setText(x % y + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplication(), "Bir Hata oluştu Tekrar deneyiniz", Toast.LENGTH_LONG).show();
        }

    }

}
