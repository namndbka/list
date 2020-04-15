package com.example.money;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerDanhsach1;
    Spinner spinnerDanhsach2;
    Integer so1 = 0;
    private TextView txtvkq1;
    private TextView txtvkq2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvkq1 = (TextView) findViewById(R.id.kq1);
        txtvkq2 = (TextView) findViewById(R.id.kq2);
        Button So0 = (Button) findViewById(R.id.so0);
        So0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "0");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });
        Button So1 = (Button) findViewById(R.id.so1);
        So1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "1");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });
        Button So2 = (Button) findViewById(R.id.so2);
        So2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "2");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });
        Button So3 = (Button) findViewById(R.id.so3);
        So3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "3");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });
        Button So4 = (Button) findViewById(R.id.so4);
        So4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "4");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });
        Button So5 = (Button) findViewById(R.id.so5);
        So5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "5");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });
        Button So6 = (Button) findViewById(R.id.so6);
        So6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "6");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });
        Button So7 = (Button) findViewById(R.id.so7);
        So7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "7");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });
        Button So8 = (Button) findViewById(R.id.so8);
        So8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "8");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });
        Button So9 = (Button) findViewById(R.id.so9);
        So9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvkq1.setText(txtvkq1.getText().toString() + "9");
                so1 = Integer.parseInt(txtvkq1.getText().toString());
            }
        });

        Button Xoaso = (Button) findViewById(R.id.CE);
        Xoaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so1 = 0;
                txtvkq1.setText("");
                txtvkq2.setText("");
            }
        });


        spinnerDanhsach1 = (Spinner) findViewById(R.id.spinner1);
        spinnerDanhsach2 = (Spinner) findViewById(R.id.spinner2);
        ArrayList<String> arrayMoney = new ArrayList<String>();
        arrayMoney.add("VND");
        arrayMoney.add("USD");
        arrayMoney.add("NDT");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayMoney);
        spinnerDanhsach1.setAdapter(arrayAdapter);
        spinnerDanhsach2.setAdapter(arrayAdapter);

        Button Do = (Button) findViewById(R.id.chay);
        Do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer so2;
                if (spinnerDanhsach1.getSelectedItem().toString() == "USD" && spinnerDanhsach2.getSelectedItem().toString() == "VND") {
                    so2 = so1*23000;
                    txtvkq2.setText(so2.toString());
                }
                else if (spinnerDanhsach1.getSelectedItem().toString() == "NDT" && spinnerDanhsach2.getSelectedItem().toString() == "VND") {
                    so2 = so1*3300;
                    txtvkq2.setText(so2.toString());
                }
                else if (spinnerDanhsach1.getSelectedItem().toString() == "VND" && spinnerDanhsach2.getSelectedItem().toString() == "VND") {
                    so2 = so1*1;
                    txtvkq2.setText(so2.toString());
                }
                else if (spinnerDanhsach1.getSelectedItem().toString() == "VND" && spinnerDanhsach2.getSelectedItem().toString() == "NDT") {
                    so2 = so1/3300;
                    txtvkq2.setText(so2.toString());
                }
                else if (spinnerDanhsach1.getSelectedItem().toString() == "VND" && spinnerDanhsach2.getSelectedItem().toString() == "USD") {
                    so2 = so1/23000;
                    txtvkq2.setText(so2.toString());
                }
                else if (spinnerDanhsach1.getSelectedItem().toString() == "USD" && spinnerDanhsach2.getSelectedItem().toString() == "NDT") {
                    so2 = so1*23000/3300;
                    txtvkq2.setText(so2.toString());
                }
                else if (spinnerDanhsach1.getSelectedItem().toString() == "NDT" && spinnerDanhsach2.getSelectedItem().toString() == "USD") {
                    so2 = so1*3300/23000;
                    txtvkq2.setText(so2.toString());
                }
            }
        });
    }
}
