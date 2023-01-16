package com.example.cardview;




import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nombre = (EditText) findViewById(R.id.editTextTextPersonName);
                EditText apellidos = (EditText) findViewById(R.id.editTextTextPersonName2);

                SharedPreferences.Editor editor = getSharedPreferences("FORM", Context.MODE_PRIVATE).edit();
                editor.putString("NOMBRE", nombre.getText().toString());
                editor.putString("APELLIDOS", apellidos.getText().toString());
                editor.apply();

                startActivity(new Intent(MainActivity.this, CardViewActivity.class));
            }
        });

    }
}