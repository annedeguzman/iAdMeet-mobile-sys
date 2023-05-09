package com.example.finalproject_cit203;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class contactpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactpage);
        ImageButton button2 = findViewById(R.id.homeBtnCont);
        ImageButton button3 = findViewById(R.id.aboutBtnCont);
        ImageButton button4 = findViewById(R.id.bookBtnCont);
        ImageButton button5 = findViewById(R.id.contBtnCont);
        ImageButton button6 = findViewById(R.id.profileBtnCont);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(contactpage.this, MainActivity.class));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(contactpage.this, aboutus.class));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(contactpage.this, book.class));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(contactpage.this, contactpage.class));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(contactpage.this, profilepage.class));
            }
        });
    }
}