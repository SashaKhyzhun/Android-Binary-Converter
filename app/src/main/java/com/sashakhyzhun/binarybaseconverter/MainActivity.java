package com.sashakhyzhun.binarybaseconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    ButtonsController controller = new ButtonsController();
    Converter converter = new Converter();

    public enum mode {
        DECIMAL, BINARY, OCTAL, HEXADECIMAL
    }

    private static mode mode;

    public static mode getMode() {
        return mode;
    }

    public void setMode(mode m) {
        mode = m;

        switch (mode) {
            case BINARY:
                controller.enableBinary(this);
                controller.disableLetters(this);
                break;
            case DECIMAL:
                controller.enableNumbers(this);
                controller.disableLetters(this);
                break;
            case OCTAL:
                controller.enableOctal(this);
                controller.disableLetters(this);
                break;
            case HEXADECIMAL:
                controller.enableNumbers(this);
                controller.enableLetters(this);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textResult = (TextView) findViewById(R.id.textResult);
        Button btn = (Button) findViewById(R.id.buttonDecimal);
        btn.setEnabled(false);
        textResult.setText("0");

        setMode(mode.DECIMAL);
    }


    /**
     * Setter Decimal
     */

    public void setDecimal(View view) {
        controller.changeOption((Button)findViewById(R.id.buttonDecimal), this);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        String str = (String) textResult.getText();

        switch(mode) {
            case BINARY:
                textResult.setText(Long.toString(converter.converterBinaryToDecimal(str)));
                break;
            case OCTAL:
                textResult.setText(Long.toString(converter.converterOctalToDecimal(str)));
                break;
            case HEXADECIMAL:
                textResult.setText(Long.toString(converter.converterHexadecimalToDecimal(str)));
                break;
        }

        setMode(mode.DECIMAL);
    }

    /**
     * Setter Binary
     */

    public void setBinary(View view) {
        controller.changeOption((Button)findViewById(R.id.buttonBinary), this);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        String str = (String) textResult.getText();

        switch (mode) {
            case DECIMAL:
                textResult.setText(converter.converterDecimalToBinary(Long.parseLong(str)));
                break;
            case OCTAL:
                textResult.setText(converter.converterOctalToBinary(str));
                break;
            case HEXADECIMAL:
                textResult.setText(converter.converterHexadecimalToBinary(str));
                break;
        }

        setMode(mode.BINARY);

    }

    /**
     * Setter Octal
     */

    public void setOctal(View view) {
        controller.changeOption((Button)findViewById(R.id.buttonOctal), this);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        String str = (String) textResult.getText();

        switch (mode) {
            case BINARY:
                textResult.setText(converter.converterBinaryToOctal(str));
                break;
            case DECIMAL:
                textResult.setText(converter.converterDecimalToOctal(Long.parseLong(str)));
                break;
            case HEXADECIMAL:
                textResult.setText(converter.converterHexadecimalToOctal(str));
                break;
        }

        setMode(mode.OCTAL);

    }

    /**
     * Setter Hexadecimal
     */

    public void setHexadecimal(View view) {
        controller.changeOption((Button)findViewById(R.id.buttonHexadecimal), this);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        String str = (String) textResult.getText();

        switch (mode) {
            case BINARY:
                textResult.setText(converter.converterBinaryToHexadecimal(str));
                break;
            case DECIMAL:
                textResult.setText(converter.converterDecimalToHexadecimal(Long.parseLong(str)));
                break;
            case OCTAL:
                textResult.setText(converter.converterOctalToHexadecimal(str));
                break;
        }

        setMode(mode.HEXADECIMAL);

    }

    /**
     * Clear TextView
     */

    public void clearTextView(View view){
        TextView textResult = (TextView) findViewById(R.id.textResult);
        textResult.setText("0");
    }

    /**
     * Return our character
     */

    public void returnCharacter(View view) {
        TextView textResult = (TextView) findViewById(R.id.textResult);
        String str = (String) textResult.getText();

        if (str.length() == 1){
            textResult.setText("0");
        } else {
            textResult.setText(str.substring(0, -1 + str.length()));
        }
    }

    /**
     * Setter Value
     */

    public void onClick(View v){
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        TextView textResult = (TextView) findViewById(R.id.textResult);
        String str = (String) textResult.getText();

        if (str.startsWith("0")){
            textResult.setText(buttonText);
        } else {
            if(str.length() < 13){
                textResult.setText(str = str.concat(buttonText));
            }
        }
    }
}