package com.sashakhyzhun.binarybaseconverter;

import android.app.Activity;

/**
 * Created by SashaKhyzhun on 12/18/16.
 */

public class Converter extends Activity {

    /**
     * DECIMAL TO BINARY
     */

    public String converterDecimalToBinary(long value) {
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

    public String converterDecimalToOctal(long value) {
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

    public String converterDecimalToHexadecimal(long value) {
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        long offset = -1;
        StringBuilder sb = new StringBuilder();

        if (value == 0) {
            return "0";
        }

        while (value > 0) {
            offset = (long) (value % 16);
            value = value / 16;
            sb.insert(0, hex[(int) offset]);
        }

        return sb.toString();
    }

    /**
     * BINARY TO DECIMAL
     */

    public long converterBinaryToDecimal(String valueBinary) {
        long offset = 0;

        for (int i = valueBinary.length(); i > 0; i--) {
            offset += Integer.parseInt(valueBinary.charAt(i - 1) + "") * Math.pow(2, (valueBinary.length() - i));
        }

        return offset;
    }

    /**
     * BINARY TO OCTAL
     */

    public String converterBinaryToOctal(String binary) {
        StringBuilder sb = new StringBuilder();
        int initPos;
        int finalPos;

        initPos = binary.length();
        finalPos = initPos;

        while (initPos > 0) {
            initPos = ((initPos - 3) >= 0) ? initPos - 3 : 0;

            sb.insert(0, converterBinaryToDecimal(binary.substring(initPos, finalPos)));
            finalPos = initPos;
        }

        return sb.toString();
    }

    /**
     * BINARY TO HEXADECIMAL
     */

    public String converterBinaryToHexadecimal(String binary) {
        char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        StringBuilder sb = new StringBuilder();
        int initPos;
        int finalPos;
        char foundChar = '-';

        initPos = binary.length();
        finalPos = initPos;

        while (initPos > 0) {
            initPos = ((initPos - 4) >= 0) ? initPos - 4 : 0;

            foundChar = hex[(int) converterBinaryToDecimal(binary.substring(initPos, finalPos))];
            sb.insert(0, foundChar);

            finalPos = initPos;
        }

        return sb.toString();
    }

    /**
     * OCTAL TO BINARY
     */

    public String converterOctalToBinary(String valueOctal) {
        long decimal = Long.parseLong(valueOctal, 8);
        return Long.toBinaryString(decimal);
    }

    /**
     * OCTAL TO DECIMAL
     */

    public long converterOctalToDecimal(String valueOctal) {
        long value = 0;

        for (int i = valueOctal.length(); i > 0; i--) {
            value += Integer.parseInt(valueOctal.charAt(i - 1) + "") * Math.pow(8, (valueOctal.length() - i));
        }

        return value;
    }

    /**
     * OCTAL TO HEXADECIMAL
     */

    public String converterOctalToHexadecimal(String valueOctal) {
        long valueDecimal = converterOctalToDecimal(valueOctal);

        return converterDecimalToHexadecimal(valueDecimal);
    }

    /**
     * HEXADECIMAL TO BINARY
     */

    public String converterHexadecimalToBinary(String valueHex) {
        long decimal = Long.parseLong(valueHex, 16);
        return Long.toBinaryString(decimal);
    }

    /**
     * HEXADECIMAL TO DECIMAL
     */

    public long converterHexadecimalToDecimal(String valueHex) {
        return Long.parseLong(valueHex, 16);
    }

    /**
     * HEXADECIMAL TO OCTAL
     */

    public String converterHexadecimalToOctal(String valueHex) {
        long decimal = Long.parseLong(valueHex, 16);
        return Long.toOctalString(decimal);
    }
}