package com.matheus.imovie.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.matheus.imovie.R;

public class LoginActivity extends AppCompatActivity {

    public static final String TAG = "LoginActivity";
    EditText txtLoginUser, txtLoginSenha;
    Button btnLoginEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        getSupportActionBar().hide();

        txtLoginUser = (EditText) findViewById(R.id.txtLoginUser);
        txtLoginSenha = (EditText) findViewById(R.id.txtLoginSenha);
        btnLoginEntrar = (Button) findViewById(R.id.btnLoginEntrar);
    }
    public void goToMenu(View view) {
        Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(intent);
        finish();
    }

    public void goToCadastro(View view) {
        Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
        startActivity(intent);
        finish();
    }
}