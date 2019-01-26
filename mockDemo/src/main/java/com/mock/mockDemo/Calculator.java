package com.mock.mockDemo;

public class Calculator{

    CalculatorService service;

    public Calculator(CalculatorService service) {
        this.service = service;
    }

    public int perform(int i, int y) {
        return service.add(i, y) * i;
        //return (i+y)*i;
    }
}
