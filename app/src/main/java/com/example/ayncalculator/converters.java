package com.example.ayncalculator;

public class converters {
    String src;
    String dest;


    public converters(String _src , String _dest) {
        src = _src;
        dest = _dest;
    }


    // Conversion Methods

    // Weight Converters

    double kg2lb(double kg){
        return 2.2046 * kg;
    }

    double lb2kg(double lb){
        return 0.45359 * lb;
    }

    double calculateWeight(double input) {
        double result = 0;
        if(src.equals("kg") && dest.equals("lb")) {
            result = kg2lb(input);
        } else if(src.equals("lb") && dest.equals("kg")) {
            result = lb2kg(input);
        }
        return result;
    }
}
