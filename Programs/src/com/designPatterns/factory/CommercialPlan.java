package com.designPatterns.factory;

public class CommercialPlan extends Plan{
    @Override
    protected void getRate() {
        rate = 8.5;
    }
}
