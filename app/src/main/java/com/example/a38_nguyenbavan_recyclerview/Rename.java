package com.example.a38_nguyenbavan_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Rename extends AppCompatActivity {
TextView tvName1;
Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rename);
        tvName1=findViewById(R.id.tvName1);

        Intent intent=getIntent();
        contact= (Contact) intent.getSerializableExtra("object1");

        tvName1.setText(contact.getName());


    }
}
