package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        double radius = input.nextDouble();
        double circleArea = Circle.getArea(radius);
        input.close();

        System.out.println("The area of a circle of a radius " + radius + " is " + circleArea);
    }
}
