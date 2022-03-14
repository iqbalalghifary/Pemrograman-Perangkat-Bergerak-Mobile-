package com.example.passingdata;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("str1", "This is a string");
        i.putExtra("age1", 25);

        Bundle extras = new Bundle();
        extras.putString("str2", "This is another string");
        extras.putInt("age2", 35);
        i.putExtras(extras);
        activityResultLauncher.launch(i);
    }

    ActivityResultLauncher activityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    if (data != null) {
                        Toast.makeText(this, Integer.toString(
                                data.getIntExtra("age3", 0)),
                                Toast.LENGTH_SHORT).show();
                        Toast.makeText(this, data.getData().toString(),
                                Toast.LENGTH_SHORT).show();
                    }
                }

            }
    );
}