package com.test.mysimplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1, operand2;
    private TextView operator, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {

        operand1 = findViewById(R.id.operand1);
        operand2 = findViewById(R.id.operand2);
        operator = findViewById(R.id.operator);
        result = findViewById(R.id.result);

    }

    public void sum(View view) {

        if (operand1.getText().toString().isEmpty()) {

            Toast.makeText(this, "op1 is empty", Toast.LENGTH_SHORT).show();

        } else if (operand2.getText().toString().isEmpty()) {

            Toast.makeText(this, "op2 is empty", Toast.LENGTH_SHORT).show();

        } else {

            int a = Integer.parseInt(operand1.getText().toString());
            int b = Integer.parseInt(operand2.getText().toString());
            int result = a + b;

            this.operator.setText("+");
            this.result.setText(String.valueOf(result));

        }

    }

    public void subtraction(View view) {

        if (operand1.getText().toString().isEmpty()) {

            Toast.makeText(this, "op1 is empty", Toast.LENGTH_SHORT).show();

        } else if (operand2.getText().toString().isEmpty()) {

            Toast.makeText(this, "op2 is empty", Toast.LENGTH_SHORT).show();

        } else {

            int a = Integer.parseInt(operand1.getText().toString());
            int b = Integer.parseInt(operand2.getText().toString());
            int result = a - b;

            this.operator.setText("-");
            this.result.setText(String.valueOf(result));

        }

    }

    public void multiplication(View view) {

        if (operand1.getText().toString().isEmpty()) {

            Toast.makeText(this, "op1 is empty", Toast.LENGTH_SHORT).show();

        } else if (operand2.getText().toString().isEmpty()) {

            Toast.makeText(this, "op2 is empty", Toast.LENGTH_SHORT).show();

        } else {

            int a = Integer.parseInt(operand1.getText().toString());
            int b = Integer.parseInt(operand2.getText().toString());
            int result = a * b;

            this.operator.setText("*");
            this.result.setText(String.valueOf(result));

        }

    }

    public void division(View view) {

        if (operand1.getText().toString().isEmpty()) {

            Toast.makeText(this, "op1 is empty", Toast.LENGTH_SHORT).show();

        } else if (operand2.getText().toString().isEmpty()) {

            Toast.makeText(this, "op2 is empty", Toast.LENGTH_SHORT).show();

        } else if (Integer.parseInt(operand2.getText().toString()) == 0) {

            Toast.makeText(this, "division by zero", Toast.LENGTH_SHORT).show();

        } else {

            int a = Integer.parseInt(operand1.getText().toString());
            int b = Integer.parseInt(operand2.getText().toString());
            int result = a / b;

            this.operator.setText("/");
            this.result.setText(String.valueOf(result));

        }

    }


}
