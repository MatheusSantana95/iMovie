package com.matheus.imovie.model;

import android.graphics.drawable.Drawable;

public class Filme {
    private String titulo;
    private String direcao;
    private Drawable imagem;

    public Filme(String titulo, String direcao, Drawable imagem) {
        this.titulo = titulo;
        this.direcao = direcao;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String autor) {
        this.direcao = direcao;
    }

    public Drawable getImagem() {
        return imagem;
    }

    public void setImagem(Drawable imagem) {
        this.imagem = imagem;
    }
}
