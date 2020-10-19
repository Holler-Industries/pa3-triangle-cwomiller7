package com.example.project;
import java.lang.Math;

public class Triangle {

    // Declare instance variables
    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    //Creates a triangle class with 6 double parameters
   public Triangle(double x0, double y0, double x1, double y1,double x2,double y2){
    this.x0 = x0;
    this.y0 = y0;
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
   }
   //creates triangle class with all 6 parameters set to 0
    public Triangle(){
       this.x0 = 0;
       this.y0 = 0;
       this.x1 = 0;
       this.y1 = 0;
       this.x2 = 0;
       this.y2 = 0;
    }
    //Method signature for accessor perimeter
    public double perimeter(){
       double perimeter = (((Math.sqrt(((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0))))+(Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)))+(Math.sqrt(((x2-x0)*(x2-x0)+(y2-y0)*(y2-y0)))))));
       return perimeter;
    }
    //Method signature for accessor area
    public double area(){
       double a = Math.sqrt((x0-x1)*(x0-x1)+(y0-y1)*(y0-y1));
       double b = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
       double c = Math.sqrt((x2-x0)*(x2-x0)+(y2-y0)*(y2-y0));
       double s = ((a+b+c)/2);
       double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
       return area;
    }
    //Method signature for a mutator that translates the Triangle horizontally by a factor of "valueX"
    public void translateX(double valueX){
      this.x0 = x0 + valueX;
      this.x1 = x1 + valueX;
      this.x2 = x2 + valueX;

    }
    //Method signature for a mutator that translates the Triangle horizontally by a factor of "valueX"
    public void translateY(double valueY){
       this.y0 = y0 + valueY;
       this.y1 = y1 + valueY;
       this.y2 = y2 + valueY;
    }

    // DO NOT DELETE THESE!
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }
}
