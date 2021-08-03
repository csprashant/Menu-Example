package com.example.menuexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mango:
                Toast.makeText(this,"Mango",Toast.LENGTH_LONG).show();
                return true;
            case R.id.apple:
                Toast.makeText(this,"Apple",Toast.LENGTH_LONG).show();
                return true;
            case R.id.grapes:
                Toast.makeText(this,"Grapes",Toast.LENGTH_LONG).show();
                return true;
            case R.id.iroMan:
                Toast.makeText(this,"Iron Man",Toast.LENGTH_LONG).show();
                return true;
            case R.id.avengers:
                Toast.makeText(this,"Avengers",Toast.LENGTH_LONG).show();
                return true;
            case R.id.thor:
                Toast.makeText(this,"Thor",Toast.LENGTH_LONG).show();
                return true;
            case R.id.close:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}