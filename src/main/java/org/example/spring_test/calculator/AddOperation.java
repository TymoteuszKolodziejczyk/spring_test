package org.example.spring_test.calculator;

public class AddOperation implements Operation {
    @Override
    public double calculate(int a, int b) {
        return a + b;
    }
}
