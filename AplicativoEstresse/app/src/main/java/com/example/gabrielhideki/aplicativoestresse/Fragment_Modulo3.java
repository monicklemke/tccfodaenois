package com.example.gabrielhideki.aplicativoestresse;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.gabrielhideki.aplicativoestresse.R;

public class Fragment_Modulo3 extends Fragment {
    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fm_modulo3, container, false);
        return rootView;
    }
}