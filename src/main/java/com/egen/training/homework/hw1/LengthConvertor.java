package main.java.com.egen.training.homework.hw1;

import java.util.Scanner;

public class LengthConvertor {
    public static void main(String[] args) {
    FeetToCentimeter converter = new FeetToCentimeter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length in feet");
        double input = scanner.nextDouble();
        if(input<0)
            System.out.println("Invalid input");
        else {
            System.out.println("Feet to Centimeter: " + converter.convert(((int) input)));
            System.out.println("Feet to Centimeter: " + converter.convert(input));
        }
    }

}
