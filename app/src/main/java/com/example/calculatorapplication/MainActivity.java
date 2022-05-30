package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText op1,op2;
    TextView result;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1 = findViewById(R.id.editOp1);
        op2 = findViewById(R.id.editOp2);
        result = findViewById(R.id.res);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b, res;
                a = Integer.parseInt(op1.getText().toString());
                b = Integer.parseInt(op2.getText().toString());
                res = a+b;
                result.setText(""+res);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b, res;
                a = Integer.parseInt(op1.getText().toString());
                b = Integer.parseInt(op2.getText().toString());
                res = a-b;
                result.setText(""+res);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b, res;
                a = Integer.parseInt(op1.getText().toString());
                b = Integer.parseInt(op2.getText().toString());
                res = a*b;
                result.setText(""+res);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b, res;
                a = Integer.parseInt(op1.getText().toString());
                b = Integer.parseInt(op2.getText().toString());
                res = a/b;
                result.setText(""+res);
            }
        });

    }

}