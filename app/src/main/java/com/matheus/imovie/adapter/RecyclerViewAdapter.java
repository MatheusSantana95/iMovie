package com.matheus.imovie.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.matheus.imovie.R;
import com.matheus.imovie.databinding.RecyclerViewItemBinding;
import com.matheus.imovie.model.Filme;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Filme> listaDeFilmes;

    public RecyclerViewAdapter(List<Filme> listaDeFilmes) {

        this.listaDeFilmes = listaDeFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerViewItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.recycler_view_item, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.titulo.setText(listaDeFilmes.get(position).getTitulo());
        holder.binding.direcao.setText(listaDeFilmes.get(position).getDirecao());
        holder.binding.cover.setImageDrawable(listaDeFilmes.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return listaDeFilmes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private RecyclerViewItemBinding binding;

        public ViewHolder(@NonNull RecyclerViewItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
