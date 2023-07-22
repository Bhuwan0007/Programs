package com.designPatterns.factory;

import java.util.Scanner;

public class CalculateBill {
    public static void main(String[] args) {
        GetPlanFactory planFactory = new GetPlanFactory();
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        //System.out.println();

        System.out.println("Enter plan");
        String planType = sc.nextLine();

        System.out.println("Enter no of units");
        int units = sc.nextInt();

        Plan plan = planFactory.getPlan(planType);

        System.out.println("Total bill for "+planType+" plan with rate of "+units+" units is : ");
        plan.getRate();
        plan.calculateBill(units);


    }
}
