package com.example.gabrielhideki.aplicativoestresse;

import android.media.MediaRecorder;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;


public class ModuloRespiracao extends AppCompatActivity {

    Chronometer cronometro;
    Button button_1;
    Boolean iniciado;
    MediaRecorder mRecorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo_respiracao);
        iniciado = false;
        cronometro = (Chronometer) findViewById(R.id.cronometro);
        button_1 = (Button) findViewById(R.id.btn_1);
        button_1.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                if (iniciado){
                    iniciado = false;
                    cronometro.stop();
                    button_1.setText("Iniciar");
                    cronometro.setText("00:00");

                }
                else{
                    iniciado = true;
                    cronometro.setBase(SystemClock.elapsedRealtime());
                    cronometro.start();
                    button_1.setText("Finalizar");
                }

            }
        });

       mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);

    }






    @Override
    protected void onResume() {
        super.onResume();

    }

    protected void OnDestroy(){
        super.onDestroy();

    }
}
