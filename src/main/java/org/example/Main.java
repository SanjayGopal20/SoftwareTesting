package org.example;

public class Main {
       public static double area(double h,double w){
           double area = h*w;
           return area;
       }
    public static double area(double r){
        double area = 3.12*r*r;
        return area;
    }
    public static void main(String[] args) {
        double h = 5.2;
        double w = 12.26;
        double r = 25.1;
        double area = area(h,w);
        System.out.println("Area of the rectangle is : "+area);
         area = area(r);
        System.out.println("Area of the Circle is : "+area);

    }
}