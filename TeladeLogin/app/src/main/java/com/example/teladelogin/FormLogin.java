package com.example.teladelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView TextTelaCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();

        TextTelaCadastro.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FormLogin.this,FormCadastro1.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){
        TextTelaCadastro = findViewById(R.id.text_tela_cadastro);
    }
}