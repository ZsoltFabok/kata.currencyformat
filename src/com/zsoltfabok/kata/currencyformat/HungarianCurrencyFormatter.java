package com.zsoltfabok.kata.currencyformat;

public class HungarianCurrencyFormatter {
    public String format(String number) {
        final StringBuilder formattedNumber = new StringBuilder(number);

        for (int i = 1; i <= (number.length() / 3); i++) {
            int position = number.length() - 3 * i;
            if (position != 0) {
                formattedNumber.insert(position, " ");
            }
        }
        return formattedNumber.toString();
    }
}