package com.example.a38_nguyenbavan_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> contacts;
    Contact contact1, contact2, contact3, contact4, contact5;
    RecyclerView recyclerView;
    ContactAdapter contactAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvlist);

        contacts = new ArrayList<>();

        contact1 = new Contact("Mr A", "0912333333");
        contact2 = new Contact("Mr B", "0912334444");
        contact3 = new Contact("Mr C", "0912355555");
        contact4 = new Contact("Mr D", "0912336666");
        contact5 = new Contact("Mr E", "0912339999");

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(),
                LinearLayoutManager.VERTICAL, false);
        contactAdapter = new ContactAdapter(contacts);
        contactAdapter.setIonClickContact(new IonClickContact() {
            @Override
            public void onClickName(Contact contact) {
                Intent intent = new Intent(getBaseContext(), Rename.class);
                intent.putExtra("object1", contact);
                startActivity(intent);
            }

            @Override
            public void onClickPhone(Contact contactPhone) {
                Intent intent = new Intent(getBaseContext(), SendOjectData.class);
                intent.putExtra("object", contactPhone);
                startActivity(intent);
            }
        });
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(contactAdapter);
    }
}
