package com.example.dmendes.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TemperaturaActivity extends AppCompatActivity implements View.OnClickListener{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        Button button = (Button) findViewById(R.id.converterBtn);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        EditText editText = (EditText) findViewById(R.id.celsiuView);
        double celsius = Double.parseDouble(editText.getText().toString());
        double fanh = (celsius*1.8) +32;

        TextView textView =(TextView) findViewById(R.id.resultado);
        textView.setText(String.valueOf(fanh) + " F°");

    }
}
