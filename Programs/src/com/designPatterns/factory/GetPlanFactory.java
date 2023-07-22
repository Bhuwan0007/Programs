package com.designPatterns.factory;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("Commercial")){
            return new CommercialPlan();
        }else if(planType.equalsIgnoreCase("Domestic")){
            return new DomesticPlan();
        }else if(planType.equalsIgnoreCase("Instittutational")){
            return new InstitutationalPlan();
        }
        return null;
    }
}
