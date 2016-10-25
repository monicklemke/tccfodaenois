package com.example.gabrielhideki.aplicativoestresse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends
        AppCompatActivity {

    SeekBar seekBar;
    TextView textView;
    int progress = 0;
    ListView lv;
    Sentimento[] sentItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(4);
        seekBar.setProgress(progress);
        Button btnSalvar = (Button) findViewById(R.id.button);

        textView = (TextView) findViewById(R.id.textView);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i;
                if (progress == 0) {

                    textView.setText("PÉSSIMO");
                } else if (progress == 1) {
                    textView.setText("TRISTE");
                }
                if (progress == 2) {
                    textView.setText("OK");
                }
                if (progress == 3) {
                    textView.setText("FELIZ");
                }
                if (progress == 4) {
                    textView.setText("ÓTIMO");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });
        lv = (ListView) findViewById(R.id.listView1);
        sentItems = new Sentimento[5];
        sentItems[0] = new Sentimento("tristeza", false);
        sentItems[1] = new Sentimento("alegria", false);
        sentItems[2] = new Sentimento("felicidade", false);
        sentItems[3] = new Sentimento("ansiedade", false);
        sentItems[4] = new Sentimento("raiva", false);
        CustomAdapter adapter = new CustomAdapter(this, sentItems);
        lv.setAdapter(adapter);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(it);
            }
        });
    }


}

