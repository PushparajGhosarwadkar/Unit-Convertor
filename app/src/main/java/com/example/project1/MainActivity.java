package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaring widgets

    EditText editText;
    TextView heading_text, kilogram_text, valueinPounds, pounds_text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instance widgets

        heading_text = findViewById(R.id.heading_text);
        kilogram_text= findViewById(R.id.kilogram_text);
        valueinPounds=findViewById(R.id.ValueinPounds);
        pounds_text=findViewById(R.id.pounds_text);

        editText=findViewById(R.id.editTextNumber); //edittextview text

        button= findViewById(R.id.button); //adding button

        // adding a click event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calling ConvertToPounds

              ConvertFromKiloToPounds();


            }
        });


    }

    private void ConvertFromKiloToPounds() {

        String ValueInkilo= editText.getText().toString();

        double kilo=Double.parseDouble(ValueInkilo);
        double pounds = kilo*2.205;

        valueinPounds.setText(""+pounds);
    }
}