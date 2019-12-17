package com.example.trainingbottom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class terceiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);
    }

    public void voltaParaAPrimeira(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
