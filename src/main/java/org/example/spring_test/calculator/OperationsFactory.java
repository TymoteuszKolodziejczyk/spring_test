package org.example.spring_test.calculator;

public class OperationsFactory {
    public static Operation create(String type) {
        if (type.equalsIgnoreCase("add"))
            return new AddOperation();
        else if (type.equalsIgnoreCase("sub"))
            return new SubOperation();
        else
            return null;
    }
}
