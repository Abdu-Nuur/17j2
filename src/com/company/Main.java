package com.company;

public class Main {

    public static void main(String[] args) {

        Shape uchburchtuk = new Uchburchtuk();
        System.out.println(uchburchtuk.getPerimeter(2.5, 4.3, 3.5));

        Shape tortburchtuk = new Tortburchtuk();
        System.out.println(tortburchtuk.getPerimeter(2.5, 2.5, 2.5, 2.5));

        Shape beshburchtuk = new Beshburchtuk();
        System.out.println(beshburchtuk.getPerimeter(2.3, 3.6, 5.1, 2.3, 3.2));

        Shape tikburchtukn = new Tikburchtuk();
        System.out.println(tikburchtukn.getPerimeter(2.0, 4.0, 2.0, 4.0));

        Shape rombik = new Rombik();
        System.out.println(rombik.getPerimeter(2.0, 2.0, 2.0, 2.0));
    }
}
