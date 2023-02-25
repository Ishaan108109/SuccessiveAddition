package com.example.additionthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondact extends AppCompatActivity {


   TextView previousresult;

    EditText third;
    Button add_three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondact);

        add_three = findViewById(R.id.add_third);
        third = findViewById(R.id.num_three);
       previousresult = findViewById(R.id.prev_result);


       Intent intent = getIntent();
       int data = intent.getIntExtra("Sum",0);
       previousresult.setText(Integer.toString(data));


        add_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer three_ = Integer.parseInt(third.getText().toString());

                int result = data + three_;

                Intent intent2 = new Intent(secondact.this,MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                intent2.putExtra("Finalsum",result);

                startActivity(intent2);
            }
        });


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
