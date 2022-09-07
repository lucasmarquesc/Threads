package com.unir.threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonIniciar;
    private int contador;
    private boolean pararExecucao = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonIniciar = findViewById(R.id.buttonIniciar);
    }
    //Sobrecarregado a Thread principal
    public void iniciarThread(View view){
        pararExecucao = false;
        for (int i=0; i<=15; i++){
            Log.d("Thread", "contador: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void pararThread(View view){
        pararExecucao = true;
    }

}