package com.matheus.imovie.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.matheus.imovie.R;
import com.matheus.imovie.adapter.RecyclerViewAdapter;
import com.matheus.imovie.databinding.ActivityMainBinding;
import com.matheus.imovie.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmeActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        List<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(new Filme("Star Wars - A Ameaça Fantasma", "George Lucas", getDrawable(R.drawable.starwars1)));
        listaDeFilmes.add(new Filme("Star Wars -  Ataque dos Clones", "George Lucas", getDrawable(R.drawable.starwars2)));
        listaDeFilmes.add(new Filme("Star Wars - A Vingança dos Sith", "George Lucas", getDrawable(R.drawable.starwars3)));
        listaDeFilmes.add(new Filme("Star Wars - Uma Nova Esperança", "George Lucas", getDrawable(R.drawable.starwars4)));
        listaDeFilmes.add(new Filme("Star Wars - O Impário Contra-Ataca", "George Lucas", getDrawable(R.drawable.starwars5)));
        listaDeFilmes.add(new Filme("Star Wars - O Retorno de Jedi", "George Lucas", getDrawable(R.drawable.starwars6)));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(listaDeFilmes);

        binding.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        binding.recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(FilmeActivity.this, MenuActivity.class));
        return;
    }
}