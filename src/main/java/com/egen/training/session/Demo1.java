package main.java.com.egen.training.session;

import java.util.Scanner;

public class Demo1 {
    public static double convertSpeed(int kilometerPerHour){
        return kilometerPerHour*0.621;
    }
    public static void main(String[] args){
        Demo1 demo = new Demo1();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed in km/hr");
        int kilometerPerHour = input.nextInt();
        if (kilometerPerHour<0)
            System.out.println("Invalid input");
        else
            System.out.println("Miles per hour: "+ demo.convertSpeed(kilometerPerHour));
    }
}
