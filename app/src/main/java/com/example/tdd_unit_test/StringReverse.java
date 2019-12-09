package com.example.tdd_unit_test;

public class StringReverse {
    public String reverse(String string) {
        StringBuilder obj = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            obj.append(string.charAt(i));
        }
        return obj.toString();
    }
}
