package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {
private RecyclerView recycleView;
private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recycleView = findViewById(R.id.contactsRecycler);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ram Kumbar","abc@gmail.com","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Outdoors-man-portrait_%28cropped%29.jpg/1200px-Outdoors-man-portrait_%28cropped%29.jpg"));
        contacts.add(new Contact("Ram Kumbar","abc@gmail.com","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Outdoors-man-portrait_%28cropped%29.jpg/1200px-Outdoors-man-portrait_%28cropped%29.jpg"));
        contacts.add(new Contact("Ram Kumbar","abc@gmail.com","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Outdoors-man-portrait_%28cropped%29.jpg/1200px-Outdoors-man-portrait_%28cropped%29.jpg"));
        contacts.add(new Contact("Ram Kumbar","abc@gmail.com","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Outdoors-man-portrait_%28cropped%29.jpg/1200px-Outdoors-man-portrait_%28cropped%29.jpg"));
        contacts.add(new Contact("Ram Kumbar","abc@gmail.com","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Outdoors-man-portrait_%28cropped%29.jpg/1200px-Outdoors-man-portrait_%28cropped%29.jpg"));
        contacts.add(new Contact("Ram Kumbar","abc@gmail.com","https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Outdoors-man-portrait_%28cropped%29.jpg/1200px-Outdoors-man-portrait_%28cropped%29.jpg"));
        ContactRecViewAdaptor adaptor = new ContactRecViewAdaptor(this);
        adaptor.setContacts(contacts);


        recycleView.setAdapter(adaptor);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}