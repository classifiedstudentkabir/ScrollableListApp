// src/main/java/com/example/scrollablelist/MainActivity.java
package com.example.scrollable_list;

import static com.example.scrollable_list.R.layout.activity_main;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        ListView listView = findViewById(R.id.listView);

        // Initialize the item list
        List<String> itemList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            itemList.add("The Binod " + i);
        }

        // Initialize the adapter and set it to the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);
    }
}