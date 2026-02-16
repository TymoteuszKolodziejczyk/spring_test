package org.example.spring_test.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private Operation operation;
    public CalculatorController() {
        operation = OperationsFactory.create("add");
    }

    @GetMapping("/{operation}/{a}/{b}")
    public double calculate(@PathVariable String operation, @PathVariable int a, @PathVariable int b) {
        Operation op = OperationsFactory.create(operation);
        assert op != null;
        return op.calculate(a, b);
    }
}
