package com.example.wordlistsqlinteractivewithsearch;

import android.view.View;

public class MyButtonOnClickListener implements View.OnClickListener {
    int id;
    String word;

    public MyButtonOnClickListener(int id, String word) {
        this.id = id;
        this.word = word;
    }

    public void onClick(View v) {
        // Implemented in WordListAdapter
    }
}
