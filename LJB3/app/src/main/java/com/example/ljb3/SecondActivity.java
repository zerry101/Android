package com.example.ljb3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnLogin=findViewById(R.id.btnLogout);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "LOGOUT Button Click", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}