# ScrollableListApp
xml file look like
![image](https://github.com/user-attachments/assets/71609fd5-7018-4722-a8f5-0062cf454086)

MainActivity file look like
![image](https://github.com/user-attachments/assets/5190a426-af73-4a95-afec-6f5ae856d937)


Create a new empty activity and give the name ScrollableList 
then select any android version ( i choose kitkat )
and then choose java then 
grozy ( 2 option )

after that press create and let it be process everything 

after its process 
connect your phone or use emulator ( i used pixel 8 api 35)

then start from here 

replace this code with your existing main_activity_xml file code
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <ListView
        android:id="@+id/listView"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</LinearLayout>

after that replace the mainactivity file ( go to app>jaa>com.example.scrollable.list>MainActivity.java
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
            itemList.add("The Binod " + i);// YOu can all change the inside text like change to " item " + i++)
        }

        // Initialize the adapter and set it to the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);
    }
}

after then run the code by pressing play button on top middle session or press shift F10

let it run for a while ( if your pc is slow like mine ) 
after it run sucessfully then you can scroll in your emulator using mouse 

how will it look
![image](https://github.com/user-attachments/assets/357949cc-97f8-47bb-8839-7798767d8a1e)

if anydoubt then contact ClassifiedstudentKabir
thank you 


