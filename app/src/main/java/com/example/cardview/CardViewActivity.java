package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class CardViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        int[] photos={R.drawable.christmas, R.drawable.christmas1, R.drawable.christmas2, };

        ImageView img = (ImageView) findViewById(R.id.img);

        Random ran=new Random();
        int i=ran.nextInt(photos.length);
        img.setImageResource(photos[i]);
        int k = ran.nextInt(photos.length);
        img.setImageResource(photos[k]);


        SharedPreferences prefs = getSharedPreferences("FORM", Context.MODE_PRIVATE);
        String name = prefs.getString("NOMBRE", "no hay nada");
        String apellidos = prefs.getString("APELLIDOS", "no hay nada");

        TextView card = (TextView) findViewById(R.id.cardview);

        card.setText(name + " " + apellidos);

    }
}