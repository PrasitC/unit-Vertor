package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        textview = findViewById(R.id.textView);
        edittext=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            private Object LocalDateTime;

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hola amigo sup!!!", Toast.LENGTH_SHORT).show();
               String  s= edittext.getText().toString();
               double pound = Integer.parseInt(s);
               double kg= pound/ 2.205 ;
               textview.setText("the value in kg is"+kg);

            }

        });

    }
}