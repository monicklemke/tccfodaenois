package com.example.gabrielhideki.aplicativoestresse;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gabrielhideki.aplicativoestresse.R;

import org.w3c.dom.Text;

public class Fragment_Modulo1 extends Fragment{


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView;
        final Activity activity = getActivity();

        rootView = inflater.inflate(R.layout.fm_modulo1, container, false);
        Button btnModulo1 = (Button) rootView.findViewById(R.id.buttonResp);

        btnModulo1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(activity, ModuloRespiracao.class);
                activity.startActivity(it);
            }
        });

        return rootView;
    }


}