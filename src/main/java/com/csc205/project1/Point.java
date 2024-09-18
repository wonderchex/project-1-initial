package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point (double x, double y){
        this.x = x;
        this.y = y;

    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n){
        this.x += n;
    }

    public void shiftY(double n){
        this.y += n;
    }

    public double distance(Point p2){
        double x1 = this.x;
        double y1 = this.y;
        double x2 = p2.getX();
        double y2 = p2.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void rotate(double angle){
        double x = this.x;
        double y = this.y;
        this.x = x * Math.cos(angle) - y * Math.sin(angle);
        this.y = x * Math.sin(angle) + y * Math.cos(angle);
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

}
