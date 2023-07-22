package com.designPatterns.factory;

public class DomesticPlan extends Plan{
    @Override
    protected void getRate() {
        rate = 4.3;
    }
}
