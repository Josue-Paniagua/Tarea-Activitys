package com.example.tareaactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button btnBack = findViewById(R.id.btnBackButton);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(ButtonActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
