package com.example.ca2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button button=(Button)findViewById(R.id.btn_log);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,Recipe.class);
                 startActivity(intent);
             }
         });
    }
    public void signup (View v){
        startActivity(new Intent(this,Signup.class));
    }
    public void onforget (View v){
        startActivity(new Intent(this,Newpassword.class));
    }
}
