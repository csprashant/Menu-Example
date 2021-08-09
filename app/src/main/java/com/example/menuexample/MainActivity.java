package com.example.menuexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> fruits;
    ArrayList<String> movies;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.listV);
        fruits=new ArrayList<>();
        movies=new ArrayList<>();
        fruits.add("Fruits");fruits.add("Mango");fruits.add("Grapes");fruits.add("Oranges");fruits.add("Banana");
        movies.add("Movies");movies.add("Justic League");movies.add("Fast Five");movies.add("Avengers");movies.add("Thor");
       
        //fruits.addAll(List.of("Fruits","Mango","Grapes","Banana","oranges"));
        //movies.addAll(List.of("Iron Man","Avengers","Thor","Fast and the Furious"));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.fruit:
                ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,fruits);
                listView.setAdapter(adapter);
                return true;
            case R.id.movies:
                ArrayAdapter<String> adapter1=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,movies);
                listView.setAdapter(adapter1);
                return true;
            case R.id.close:
                finish();
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}