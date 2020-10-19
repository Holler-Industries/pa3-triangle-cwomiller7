package com.example.project;

public class TestTriangle {
    public static void main(String[] args){
        Triangle myTriangle = new Triangle(1,4,2,7,8,1);

        double x0 = myTriangle.getx0();
        double y0 = myTriangle.gety0();
        double x1 = myTriangle.getx1();
        double y1 = myTriangle.gety1();
        double x2 = myTriangle.getx2();
        double y2 = myTriangle.gety2();

        System.out.println("Expected values; 1 4 2 7 8 1");
        System.out.println("Actual Values: ");
        System.out.println(x0);
        System.out.println(y0);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);

        myTriangle.translateX(5);
        myTriangle.translateY(5);
        System.out.println("Expected values; 6 9 7 12 13 6");
        System.out.println("Actual Values: ");
        x0 = myTriangle.getx0();
        y0 = myTriangle.gety0();
        x1 = myTriangle.getx1();
        y1 = myTriangle.gety1();
        x2 = myTriangle.getx2();
        y2 = myTriangle.gety2();
        System.out.println(x0);
        System.out.println(y0);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);

        System.out.println("expected area: 12");
        System.out.println("Actual Area:");
        System.out.println(myTriangle.area());
        System.out.println("expected perimeter: 19.263");
        System.out.println("Actual perimeter: ");
        System.out.println(myTriangle.perimeter());


    }


}
