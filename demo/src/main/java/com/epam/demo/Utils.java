package com.epam.demo;

import java.beans.Introspector;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            int n = Integer.parseInt(arg);
            if (n < 0) return false;
        }
        return true;
    }
}