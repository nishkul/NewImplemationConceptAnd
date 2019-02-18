package com.example.androd.newimplemationconceptand.dagger2.tryexample_dragger;

public class SumImpl implements ISum {

    private int finalno = 0;

    public SumImpl() {
        finalno = 5 + 7;
    }

    public void additionOftwoNo(int num1, int num2) {

        finalno = num1 + num2;

    }
    @Override
    public int finalCaluation() {
        return finalno;
    }
}
