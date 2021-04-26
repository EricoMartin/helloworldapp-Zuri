package com.basebox.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button =  findViewById(R.id.button);
        TextView textView = findViewById(R.id.text);
         textView.setText(Integer.toString(number));

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 number = number + 1;
                 textView.setText(Integer.toString(number));
             }
         });
    }
}