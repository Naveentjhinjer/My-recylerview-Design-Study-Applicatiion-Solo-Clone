package com.example.nestedrecycle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Word extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        pdfView = findViewById(R.id.msword);
        pdfView.fromAsset("word.pdf")
                .load();
    }
}
