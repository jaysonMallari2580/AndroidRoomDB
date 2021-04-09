package com.example.androidroomdb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

public class WordViewHolder extends RecyclerView.ViewHolder {
    public final MaterialTextView wordTitle;

    private WordViewHolder(View itemView){
        super(itemView);
        wordTitle = itemView.findViewById(R.id.word_title_textview);
    }

    public void bind(String text){
        wordTitle.setText(text);
    }

    static WordViewHolder create(ViewGroup parent){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main,parent,false);

        return new WordViewHolder(view);
    }
}
