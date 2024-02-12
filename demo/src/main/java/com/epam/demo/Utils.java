package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            try {
                double num = Double.parseDouble(arg);
                if (num <= 0) return false;
            } catch (NumberFormatException e) {
                // Handle the case where parsing fails (e.g., non-numeric input)
                return false;
            }
        }
        return true;
    }
}
