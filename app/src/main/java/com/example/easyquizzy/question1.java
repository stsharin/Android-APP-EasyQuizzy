package com.example.easyquizzy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class question1 extends AppCompatActivity {

    RadioButton r1, r2, r3, r4;
    public static int points = 0;
    Button confirm, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);

        r1 = (RadioButton) findViewById(R.id.rd_1);
        r2 = (RadioButton) findViewById(R.id.rd_2);
        r3 = (RadioButton) findViewById(R.id.rd_3);
        r4 = (RadioButton) findViewById(R.id.rd_4);
        confirm = (Button) findViewById(R.id.btn_confirm);
        next = (Button) findViewById(R.id.btn_next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(question1.this, question2.class);
                startActivity(i);
            }
        });
    }

    public void con(View v){
        try{
            if (r1.isChecked()){
                points = points + 10;
                Toast.makeText(getApplicationContext(), "10 Points", Toast.LENGTH_SHORT).show();
            }

            else if (r2.isChecked()){
                points = points + 0;
                Toast.makeText(getApplicationContext(), "Wrong Answer! Press Next.", Toast.LENGTH_SHORT).show();
            }

            else if (r3.isChecked()){
                points = points + 0;
                Toast.makeText(getApplicationContext(), "Wrong Answer! Press Next.", Toast.LENGTH_SHORT).show();
            }

            else if (r4.isChecked()){
                points = points + 0;
                Toast.makeText(getApplicationContext(), "Wrong Answer! Press Next.", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), "There is a Problem", Toast.LENGTH_SHORT).show();
        }
    }
}
