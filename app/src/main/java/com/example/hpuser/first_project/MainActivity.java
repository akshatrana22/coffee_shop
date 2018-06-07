package com.example.hpuser.first_project;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    TextView tv;
    TextView tv2;
    EditText type;
    RadioButton one;
    TextView q;
    RadioButton two;
    RadioButton three;
    Button get;


    @SuppressLint("WrongViewCast")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= findViewById(R.id.name1);
        type= findViewById(R.id.type1);
        one= findViewById(R.id.first);
        two= findViewById(R.id.second);
        three= findViewById(R.id.third);
        get= findViewById(R.id.hello);

        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names= String.valueOf(name.getText());
                int quantity= Integer.parseInt(type.getText().toString());
                int totalPrice= 0;

                if (one.isChecked())
                {
                    totalPrice= quantity*10;
                }
                else if (two.isChecked())
                {
                    totalPrice= quantity*15;
                }
                else {
                    totalPrice= quantity*20;
                }

                Toast.makeText(getApplicationContext(), "hello" +names+ "your order is:" +totalPrice,Toast.LENGTH_LONG).show();
            }
        });




    }
}
