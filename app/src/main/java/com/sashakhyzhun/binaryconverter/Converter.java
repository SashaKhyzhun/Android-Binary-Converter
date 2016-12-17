package com.sashakhyzhun.binaryconverter;

import android.app.Activity;

/**
 * Created by SashaKhyzhun on 12/18/16.
 */

public class Converter extends Activity {

    /**
     * DECIMAL TO BINARY
     */

    public String converterDecimalParaBinary(long value) {
        long offset = -1;
        StringBuilder sb = new StringBuilder();

        if (value == 0) {
            return "0";
        }

        while (value > 0) {
            offset = (long) (value % 2);
            value = value / 2;
            sb.insert(0, offset);
        }

        return sb.toString();
    }

    /**
     * DECIMAL TO OCTAL
     */

    public String converterDecimalParaOctal(long value) {
        long offset = -1;
        StringBuilder sb = new StringBuilder();

        if (value == 0) {
            return "0";
        }

        while (value > 0) {
            offset = (long) (value % 8);
            value = value / 8;
            sb.insert(0, offset);
        }

        return sb.toString();
    }

    /**
     * DECIMAL TO HEXADECIMAL
     */

    public String converterDecimalParaHexadecimal(long valor) {
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        long offset = -1;
        StringBuilder sb = new StringBuilder();

        if (valor == 0) {
            return "0";
        }

        while (valor > 0) {
            offset = (long) (valor % 16);
            valor = valor / 16;
            sb.insert(0, hex[(int) offset]);
        }

        return sb.toString();
    }

    /**
     * BINARY TO DECIMAL
     */

    public long converterBinaryParaDecimal(String valorBinary) {
        long valor = 0;

        for (int i = valorBinary.length(); i > 0; i--) {
            valor += Integer.parseInt(valorBinary.charAt(i - 1) + "") * Math.pow(2, (valorBinary.length() - i));
        }

        return valor;
    }

    /**
     * BINARY TO OCTAL
     */

    public String converterBinaryParaOctal(String binary) {
        StringBuilder sb = new StringBuilder();
        int initPos;
        int finalPos;

        initPos = binary.length();
        finalPos = initPos;

        while (initPos > 0) {
            initPos = ((initPos - 3) >= 0) ? initPos - 3 : 0;

            sb.insert(0, converterBinaryParaDecimal(binary.substring(initPos, finalPos)));
            finalPos = initPos;
        }

        return sb.toString();
    }

    /**
     * BINARY TO HEXADECIMAL
     */

    public String converterBinaryParaHexadecimal(String binary) {
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        StringBuilder sb = new StringBuilder();
        int initPos;
        int finalPos;
        char foundChar = '-';

        initPos = binary.length();
        finalPos = initPos;

        while (initPos > 0) {
            initPos = ((initPos - 4) >= 0) ? initPos - 4 : 0;

            foundChar = hex[(int) converterBinaryParaDecimal(binary.substring(initPos, finalPos))];
            sb.insert(0, foundChar);

            finalPos = initPos;
        }

        return sb.toString();
    }

    /**
     * OCTAL TO BINARY
     */

    public String converterOctalParaBinary(String valorOctal) {
        long decimal = Long.parseLong(valorOctal, 8);
        return Long.toBinaryString(decimal);
    }

    /**
     * OCTAL TO DECIMAL
     */

    public long converterOctalParaDecimal(String valorOctal) {
        long valor = 0;

        for (int i = valorOctal.length(); i > 0; i--) {
            valor += Integer.parseInt(valorOctal.charAt(i - 1) + "") * Math.pow(8, (valorOctal.length() - i));
        }

        return valor;
    }

    /**
     * OCTAL TO HEXADECIMAL
     */

    public String converterOctalParaHexadecimal(String valueOctal) {
        long valorDecimal = converterOctalParaDecimal(valueOctal);

        return converterDecimalParaHexadecimal(valorDecimal);
    }

    /**
     * HEXADECIMAL TO BINARY
     */

    public String converterHexadecimalParaBinary(String valueHex) {
        long decimal = Long.parseLong(valueHex, 16);
        return Long.toBinaryString(decimal);
    }

    /**
     * HEXADECIMAL TO DECIMAL
     */

    public long converterHexadecimalParaDecimal(String valueHex) {
        return Long.parseLong(valueHex, 16);
    }

    /**
     * HEXADECIMAL TO OCTAL
     */

    public String converterHexadecimalParaOctal(String valueHex) {
        long decimal = Long.parseLong(valueHex, 16);
        return Long.toOctalString(decimal);
    }
}