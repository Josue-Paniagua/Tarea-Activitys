package com.example.tareaactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnText, btnButton, btnWidgets;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);

            btnText = findViewById(R.id.btnText);
            btnButton = findViewById(R.id.btnButton);
            btnWidgets = findViewById(R.id.btnWidgets);

            // Abrir TextActivity
            btnText.setOnClickListener(v ->
            {
                Intent intent = new Intent(MainActivity.this, TextActivity.class);
                startActivity(intent);

            });
            btnButton.setOnClickListener(v ->
            {
                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            });
            btnWidgets.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, WidgetsActivity.class);
                startActivity(intent);
            });


            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }
    }