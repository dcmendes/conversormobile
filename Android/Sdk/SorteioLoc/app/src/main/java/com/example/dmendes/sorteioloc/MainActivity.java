package com.example.dmendes.sorteioloc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void sorteioOnClick(View view){
        EditText txt1 = (EditText) findViewById(R.id.minText);
        EditText txt2 = (EditText) findViewById(R.id.maxText);

        int num = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        Random gerador = new Random();
        int res = gerador.nextInt(num2 -num) + num;
        if (res == num){
            res++;
        }

        TextView textView = (TextView) findViewById(R.id.resultadoView);
        textView.setText(Integer.toString(res));
    }

}
