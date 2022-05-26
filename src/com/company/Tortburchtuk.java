package com.company;

public class Tortburchtuk extends Shape {
    @Override
    public double getPerimeter(Double... perimeter) {
        System.out.print("Tort burchtuktun perimetri: ");
        Double a = Double.valueOf(0);
        for (int i = 0; i < perimeter.length; i++) {
            a += perimeter[i];
        }
        return a;
    }
}
