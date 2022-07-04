package org.example;

import org.example.mathdevices.AbstractCalculator;
import org.example.mathdevices.MiniWindowsFreeCalculator;

public class Main {
    public static void main(String[] args) {

        MiniWindowsFreeCalculator calculator = new MiniWindowsFreeCalculator();
        System.out.println("My awesome calculator lives!");
        calculator.addValue(3F);
        showCalculatorValue(calculator);
        calculator.divideBy(10F);
        showCalculatorValue(calculator);
        calculator.divideBy(0F);
        showCalculatorValue(calculator);
        calculator.resetStoredValue();
        showCalculatorValue(calculator);
    }

    private static void showCalculatorValue(AbstractCalculator calculator) {
        System.out.println("My total accurate calculator shows: " + calculator.getValueAsString());
    };
}