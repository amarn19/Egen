package main.java.com.egen.training.homework.hw2;

import java.util.Scanner;

public class CostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the Room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter Width of the Room: ");
        double width = scanner.nextDouble();
        System.out.println("Enter cost per square foot for carpeting: ");
        double costPerSqFt = scanner.nextDouble();
        if (length < 0 || width < 0 || costPerSqFt < 0)
            System.out.println("Invalid inputs");
        else {
            RoomDimension roomDimension = new RoomDimension(length, width);
            RoomCarpet roomCarpet = new RoomCarpet(roomDimension, costPerSqFt);

            System.out.println("Total cost of carpeting: " + roomCarpet.totalCost());
        }

    }

}
