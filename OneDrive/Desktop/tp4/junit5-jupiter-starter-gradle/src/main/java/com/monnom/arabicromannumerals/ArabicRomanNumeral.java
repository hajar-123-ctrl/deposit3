package com.monnom.arabicromannumerals;

public class ArabicRomanNumeral {
    public String convert(int number) {
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        }

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String roman = thousands[number / 1000];
        number %= 1000;
        roman += hundreds[number / 100];
        number %= 100;
        roman += tens[number / 10];
        number %= 10;
        roman += ones[number];

        return roman;
    }
}
