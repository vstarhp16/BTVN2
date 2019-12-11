package com.example.a38_nguyenbavan_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SendOjectData extends AppCompatActivity {
    TextView tvName,tvPhone;
    Contact contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_oject_data);
        tvName=findViewById(R.id.tvName);
        tvPhone=findViewById(R.id.tvPhone);

        Intent intent=getIntent();
        contact= (Contact) intent.getSerializableExtra("object");

        tvPhone.setText(contact.getmPhone());
        tvName.setText(contact.getName());
    }
}
