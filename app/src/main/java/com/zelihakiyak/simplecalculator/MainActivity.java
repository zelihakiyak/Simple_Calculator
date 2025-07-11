package com.zelihakiyak.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Global scopeta tanımladık.
    EditText number1Text;
    EditText number2Text;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        textView = findViewById(R.id.textView);



    }

    public void sum(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            textView.setText("Please enter number!");
        } else{
            int num1 = Integer.parseInt(number1Text.getText().toString());
            int num2 = Integer.parseInt(number2Text.getText().toString());

            int res = num1 + num2;
            textView.setText("Result: "+ res);

        }
    }
    public void sub(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            textView.setText("Please enter number!");
        } else{
            int num1 = Integer.parseInt(number1Text.getText().toString());
            int num2 = Integer.parseInt(number2Text.getText().toString());

            int res = num1 - num2;
            textView.setText("Result: "+ res);
        }
    }
    public void mul(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            textView.setText("Please enter number!");
        } else{
            int num1 = Integer.parseInt(number1Text.getText().toString());
            int num2 = Integer.parseInt(number2Text.getText().toString());

            int res = num1 * num2;
            textView.setText("Result: "+ res);
        }
    }
    public void div(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            textView.setText("Please enter number!");
        } else{
            int num1 = Integer.parseInt(number1Text.getText().toString());
            int num2 = Integer.parseInt(number2Text.getText().toString());
            if(num2 == 0){
                textView.setText("Can not divide.\nPlease enter another number!");

            }else {
                int res = num1 / num2;
                textView.setText("Result: " + res);
            }
        }
    }
}