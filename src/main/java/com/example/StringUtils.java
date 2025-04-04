package com.example;

public class StringUtils {

    public boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    public String toUpperCase(String s) {
        if (s == null) return null;
        return s.toUpperCase();
    }

    public String toLowerCase(String s) {
        if (s == null) return null;
        return s.toLowerCase();
    }

    public int countVowels(String s) {
        if (s == null) return 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
