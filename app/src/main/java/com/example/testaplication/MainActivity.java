package com.example.testaplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {



     = ()


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void login (View v)
    {
        Intent intent= new Intent(this, room.class);
        startActivity(intent);
    }
    public void singUp(View v)
    {
        Intent intent= new Intent(this, singup.class);
        startActivity(intent);
    }

}