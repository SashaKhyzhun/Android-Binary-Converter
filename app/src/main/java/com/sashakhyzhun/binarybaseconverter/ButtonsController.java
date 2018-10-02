package com.sashakhyzhun.binarybaseconverter;

/**
 * Created by SashaKhyzhun on 12/18/16.
 */

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.widget.Button;

import static java.security.AccessController.getContext;

public class ButtonsController {

    /**
     * ENABLE BINARY
     */

    public void enableBinary(Context ctx){
        Activity act = (Activity) ctx;

        Button button0 = (Button) act.findViewById(R.id.button0);
        button0.setEnabled(true);
        button0.setText("0");
        Button button1 = (Button) act.findViewById(R.id.button1);
        button1.setEnabled(true);
        button1.setText("1");

        Button button2 = (Button) act.findViewById(R.id.button2);
        button2.setEnabled(false);
        button2.setText("");
        Button button3 = (Button) act.findViewById(R.id.button3);
        button3.setEnabled(false);
        button3.setText("");
        Button button4 = (Button) act.findViewById(R.id.button4);
        button4.setEnabled(false);
        button4.setText("");
        Button button5 = (Button) act.findViewById(R.id.button5);
        button5.setEnabled(false);
        button5.setText("");
        Button button6 = (Button) act.findViewById(R.id.button6);
        button6.setEnabled(false);
        button6.setText("");
        Button button7 = (Button) act.findViewById(R.id.button7);
        button7.setEnabled(false);
        button7.setText("");
        Button button8 = (Button) act.findViewById(R.id.button8);
        button8.setEnabled(false);
        button8.setText("");
        Button button9 = (Button) act.findViewById(R.id.button9);
        button9.setEnabled(false);
        button9.setText("");
    }

    /**
     * ENABLE OCTAL
     */

    public void enableOctal(Context ctx){
        Activity act = (Activity) ctx;

        Button button0 = (Button) act.findViewById(R.id.button0);
        button0.setEnabled(true);
        button0.setText("0");
        Button button1 = (Button) act.findViewById(R.id.button1);
        button1.setEnabled(true);
        button1.setText("1");
        Button button2 = (Button) act.findViewById(R.id.button2);
        button2.setEnabled(true);
        button2.setText("2");
        Button button3 = (Button) act.findViewById(R.id.button3);
        button3.setEnabled(true);
        button3.setText("3");
        Button button4 = (Button) act.findViewById(R.id.button4);
        button4.setEnabled(true);
        button4.setText("4");
        Button button5 = (Button) act.findViewById(R.id.button5);
        button5.setEnabled(true);
        button5.setText("5");
        Button button6 = (Button) act.findViewById(R.id.button6);
        button6.setEnabled(true);
        button6.setText("6");
        Button button7 = (Button) act.findViewById(R.id.button7);
        button7.setEnabled(true);
        button7.setText("7");

        Button button8 = (Button) act.findViewById(R.id.button8);
        button8.setEnabled(false);
        button8.setText("");
        Button button9 = (Button) act.findViewById(R.id.button9);
        button9.setEnabled(false);
        button9.setText("");
    }

    /**
     * ENABLE NUMBERS
     */

    public void enableNumbers(Context ctx){
        Activity act = (Activity) ctx;

        Button button0 = (Button) act.findViewById(R.id.button0);
        button0.setEnabled(true);
        button0.setText("0");
        Button button1 = (Button) act.findViewById(R.id.button1);
        button1.setEnabled(true);
        button1.setText("1");
        Button button2 = (Button) act.findViewById(R.id.button2);
        button2.setEnabled(true);
        button2.setText("2");
        Button button3 = (Button) act.findViewById(R.id.button3);
        button3.setEnabled(true);
        button3.setText("3");
        Button button4 = (Button) act.findViewById(R.id.button4);
        button4.setEnabled(true);
        button4.setText("4");
        Button button5 = (Button) act.findViewById(R.id.button5);
        button5.setEnabled(true);
        button5.setText("5");
        Button button6 = (Button) act.findViewById(R.id.button6);
        button6.setEnabled(true);
        button6.setText("6");
        Button button7 = (Button) act.findViewById(R.id.button7);
        button7.setEnabled(true);
        button7.setText("7");
        Button button8 = (Button) act.findViewById(R.id.button8);
        button8.setEnabled(true);
        button8.setText("8");
        Button button9 = (Button) act.findViewById(R.id.button9);
        button9.setEnabled(true);
        button9.setText("9");
    }

    /**
     * ENABLE LETTERS
     */

    public void enableLetters(Context ctx){
        Activity act = (Activity) ctx;

        Button buttonA = (Button) act.findViewById(R.id.buttonA);
        buttonA.setEnabled(true);
        buttonA.setText("A");
        Button buttonB = (Button) act.findViewById(R.id.buttonB);
        buttonB.setEnabled(true);
        buttonB.setText("B");
        Button buttonC = (Button) act.findViewById(R.id.buttonC);
        buttonC.setEnabled(true);
        buttonC.setText("C");
        Button buttonD = (Button) act.findViewById(R.id.buttonD);
        buttonD.setEnabled(true);
        buttonD.setText("D");
        Button buttonE = (Button) act.findViewById(R.id.buttonE);
        buttonE.setEnabled(true);
        buttonE.setText("E");
        Button buttonF = (Button) act.findViewById(R.id.buttonF);
        buttonF.setEnabled(true);
        buttonF.setText("F");
    }

    /**
     * DISABLE LETTERS
     */

    public void disableLetters(Context ctx){
        Activity act = (Activity) ctx;

        Button buttonA = (Button) act.findViewById(R.id.buttonA);
        buttonA.setEnabled(false);
        buttonA.setText("");
        Button buttonB = (Button) act.findViewById(R.id.buttonB);
        buttonB.setEnabled(false);
        buttonB.setText("");
        Button buttonC = (Button) act.findViewById(R.id.buttonC);
        buttonC.setEnabled(false);
        buttonC.setText("");
        Button buttonD = (Button) act.findViewById(R.id.buttonD);
        buttonD.setEnabled(false);
        buttonD.setText("");
        Button buttonE = (Button) act.findViewById(R.id.buttonE);
        buttonE.setEnabled(false);
        buttonE.setText("");
        Button buttonF = (Button) act.findViewById(R.id.buttonF);
        buttonF.setEnabled(false);
        buttonF.setText("");
    }

    /**
     * CHANGE OPTION MODE
     */

    public void changeOption(Button b, Context ctx){
        Activity act = (Activity) ctx;
        b.setEnabled(false);
        MainActivity.mode localMode = MainActivity.getMode();
        switch (localMode) {
            case DECIMAL:
                act.findViewById(R.id.buttonDecimal).setEnabled(true);
                break;
            case BINARY:
                act.findViewById(R.id.buttonBinary).setEnabled(true);
                break;
            case OCTAL:
                act.findViewById(R.id.buttonOctal).setEnabled(true);
                break;
            case HEXADECIMAL:
                act.findViewById(R.id.buttonHexadecimal).setEnabled(true);
                break;
        }
    }
}