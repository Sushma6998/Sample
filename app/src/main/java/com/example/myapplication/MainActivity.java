package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonsum,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListeneronButton();
        
    }
    
    public void addListeneronButton() {
        // buttonsum= (Button) findViewById(R.id.button);
         buttonsum.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View view) {
              }
              
          });
       
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            }

        });




    }
 } 
