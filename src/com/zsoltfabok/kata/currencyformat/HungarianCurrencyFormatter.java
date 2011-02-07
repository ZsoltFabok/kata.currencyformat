package com.zsoltfabok.kata.currencyformat;

public class HungarianCurrencyFormatter {

    public String format(String number) {
        if (isInteger(number)) {
            return insertThousandSeparator(number);
        } else {
            String integerValueOfTheNumber = number.split("\\.")[0];
            StringBuilder formattedNumber = new StringBuilder();
            formattedNumber.append(insertThousandSeparator(integerValueOfTheNumber));
            formattedNumber.append(",");
            formattedNumber.append(number.split("\\.")[1]);
            return formattedNumber.toString();
        }
    }

    private boolean isInteger(String number) {
        return !number.contains(".");
    }

    private String insertThousandSeparator(String number) {
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