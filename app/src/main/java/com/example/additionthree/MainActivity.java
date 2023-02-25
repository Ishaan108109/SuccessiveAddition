package com.example.additionthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText One, Two;
    private Button addfirst;

     TextView final_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addfirst =  findViewById(R.id.add);
        One =  findViewById(R.id.num_one);
        Two =  findViewById(R.id.num_two) ;


        addfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int One_ = Integer.parseInt(One.getText().toString());
                int Two_ = Integer.parseInt(Two.getText().toString());

                int result = One_ + Two_;

                Intent intent = new Intent(MainActivity.this,secondact.class);

                intent.putExtra("Sum",result);


                startActivity(intent);
            }





        });
        final_res = findViewById(R.id.Final_result);
        Intent intent = getIntent();
        int newdata = intent.getIntExtra("Finalsum",0);
        final_res.setText(String.valueOf(newdata));



    }


}



///num_one
//num_two
//add
//Final_result

//--------secondact
//Result
//num_three
//add_third

//num_one+(add)num_two=Result
//num_three+(add_third)Result=Final_Result
