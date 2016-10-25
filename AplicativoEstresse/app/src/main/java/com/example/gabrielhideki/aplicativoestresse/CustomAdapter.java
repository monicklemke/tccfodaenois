package com.example.gabrielhideki.aplicativoestresse;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<Sentimento> {
    Sentimento[] sentItems = null;
    Context context;
    public CustomAdapter(Context context, Sentimento[] resource) {
        super(context,R.layout.row,resource);
        this.context = context;
        this.sentItems = resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.row, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.textView1);
        CheckBox cb = (CheckBox) convertView.findViewById(R.id.checkBox1);
        name.setText(sentItems[position].getName());
        cb.setChecked(sentItems[position].getValue());
        return convertView;
    }
}
