package com.pocket.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout root = new RelativeLayout(this);
        root.setBackgroundColor(Color.parseColor("#1a1a1a"));
        LinearLayout menu = new LinearLayout(this);
        menu.setOrientation(LinearLayout.VERTICAL);
        menu.setGravity(Gravity.CENTER);
        TextView title = new TextView(this);
        title.setText("MINE-LAUNCHER\nBEDROCK");
        title.setTextSize(30);
        title.setTextColor(Color.GREEN);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 0, 0, 80);
        menu.addView(title);
        Spinner spinner = new Spinner(this);
        String[] versoes = {"Alpha 0.1.0", "PE 0.14.0", "Bedrock 1.20", "Bedrock 1.21"};
        spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, versoes));
        menu.addView(spinner);
        Button btnPlay = new Button(this);
        btnPlay.setText("INICIAR MOTOR C++");
        btnPlay.setBackgroundColor(Color.parseColor("#2e7d32"));
        btnPlay.setTextColor(Color.WHITE);
        btnPlay.setOnClickListener(v -> {
            Toast.makeText(this, "A carregar Engine...", Toast.LENGTH_LONG).show();
        });
        menu.addView(btnPlay);
        root.addView(menu, new RelativeLayout.LayoutParams(-1, -1));
        setContentView(root);
    }
          }
