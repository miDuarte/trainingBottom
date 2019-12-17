package com.example.trainingbottom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundaTela extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
    }

    public void vaiParaaTerceira(View view) {
        Intent intent = new Intent(this, terceiraTela.class);
        startActivity(intent);
    }
}
