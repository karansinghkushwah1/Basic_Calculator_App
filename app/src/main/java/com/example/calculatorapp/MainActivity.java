package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText Num1,Num2;
    TextView Result;
    Button btplus,btminus,btmulti,btdivide,btsin,btcos,bttan,btlog,btcosec,btsec,btcot,btsqrt,btx2,btx3,btxy,btreset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1=(EditText) findViewById(R.id.txtNum1);
        Num2=(EditText) findViewById(R.id.txtNum2);
        Result=(TextView) findViewById(R.id.txtResult);
        Num1=(EditText) findViewById(R.id.txtNum1);
        btplus=(Button) findViewById(R.id.txtplus);
        btminus=(Button) findViewById(R.id.txtminus);
        btmulti=(Button) findViewById(R.id.txtmulti);
        btdivide=(Button) findViewById(R.id.txtdivide);
        btsin=(Button) findViewById(R.id.txtsin);
        btcos=(Button) findViewById(R.id.txtcos);
        bttan=(Button) findViewById(R.id.txttan);
        btlog=(Button) findViewById(R.id.txtlog);
        btcosec=(Button) findViewById(R.id.txtcosec);
        btsec=(Button) findViewById(R.id.txtsec);
        btcot=(Button) findViewById(R.id.txtcot);
        btsqrt=(Button) findViewById(R.id.txtsqrt);
        btx2=(Button) findViewById(R.id.txtx2);
        btx3=(Button) findViewById(R.id.txtx3);
        btxy=(Button) findViewById(R.id.txtxy);
        btreset=(Button) findViewById(R.id.txtreset);

        btplus.setOnClickListener(this);
        btminus.setOnClickListener(this);
        btmulti.setOnClickListener(this);
        btdivide.setOnClickListener(this);
        btsin.setOnClickListener(this);
        btcos.setOnClickListener(this);
        bttan.setOnClickListener(this);
        btlog.setOnClickListener(this);
        btcosec.setOnClickListener(this);
        btsec.setOnClickListener(this);
        btcot.setOnClickListener(this);
        btsqrt.setOnClickListener(this);
        btx2.setOnClickListener(this);
        btx3.setOnClickListener(this);
        btxy.setOnClickListener(this);
        btreset.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int number1, number2;
        double output;
        number1 = Integer.parseInt(Num1.getText().toString());
        number2 = Integer.parseInt(Num2.getText().toString());
        switch (view.getId()){
            case R.id.txtplus:
                output = number1 + number2;
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtminus:
                output = number1 - number2;
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtmulti:
                output = number1 * number2;
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtdivide:
                output = number1 / number2;
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtsin:
                output = Math.sin(number1);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtcos:
                output = Math.cos(number1);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txttan:
                output = Math.tan(number1);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtlog:
                output = Math.log(number1);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtcosec:
                output = 1/Math.sin(number1);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtsec:
                output = 1/Math.cos(number1);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtcot:
                output =1/Math.tan(number1);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtsqrt:
                output = Math.sqrt(number1);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtx2:
                output = Math.pow(number1,2);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtx3:
                output = Math.pow(number1,3);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtxy:
                output = Math.pow(number1, number2);
                Result.setText(String.valueOf(output));
                break;
            case R.id.txtreset:
                // Reset button logic here
                Num1.setText("");
                Num2.setText("");
                Result.setText("0");
                break;
        }
    }
}