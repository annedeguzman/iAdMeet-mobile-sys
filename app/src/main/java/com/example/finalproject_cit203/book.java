package com.example.finalproject_cit203;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Button bookbtnconf = findViewById(R.id.bookNowBtn);
        ImageButton button2 = findViewById(R.id.homeBtnBook);
        ImageButton button3 = findViewById(R.id.aboutBtnBook);
        ImageButton button4 = findViewById(R.id.bookBtnBook);
        ImageButton button5 = findViewById(R.id.contBtnBook);
        ImageButton button6 = findViewById(R.id.profileBtnBook);

        bookbtnconf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(book.this, confirmpage.class));
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(book.this, MainActivity.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(book.this, aboutus.class));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(book.this, book.class));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(book.this, contactpage.class));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(book.this, profilepage.class));
            }
        });
    }
}