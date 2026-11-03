
package com.poketracker.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(25, 30, 25, 30);
        layout.setBackgroundColor(Color.rgb(17, 19, 29));

        TextView title = new TextView(this);
        title.setText("POKETRACKER");
        title.setTextSize(32);
        title.setTextColor(Color.rgb(255, 190, 50));
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("YOUR POKEMON COLLECTION");
        subtitle.setTextColor(Color.WHITE);
        subtitle.setTextSize(14);
        subtitle.setGravity(Gravity.CENTER);

        Button scan = new Button(this);
        scan.setText("📷  SKANUJ KARTĘ");

        Button collection = new Button(this);
        collection.setText("MOJA KOLEKCJA");

        Button prices = new Button(this);
        prices.setText("CENY KART");

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(scan);
        layout.addView(collection);
        layout.addView(prices);

        setContentView(layout);
    }
}
