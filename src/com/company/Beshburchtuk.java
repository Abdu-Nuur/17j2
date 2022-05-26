package com.company;

public class Beshburchtuk extends Shape {
    @Override
    public double getPerimeter(Double... perimeter) {
        System.out.print("Besh burchtuktun perimetri: ");
        Double a = Double.valueOf(0);
        for (int i = 0; i < perimeter.length; i++) {
            a += perimeter[i];
        }
        return a;
    }
}
