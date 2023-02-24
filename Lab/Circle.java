package com.cognizant.shapes;

class Circle{
    float radius; //instance variable radius 
    float pi; //instance variable pi
    Circle(){ //default constructor
        radius = 1.5f; //initialize the radius         
    }
    Circle(float radius){
        this(3,2);
        this.radius = radius; //initializing with the method argument radius
    }
    Circle(float radius, float pi){
        this.pi = 3.5f; //default pi value
        this.radius = radius; //initializing with the method argument radius
    }
    //Creating Methods
    float calculateCircleArea() {
    	float area = pi*radius*radius;
        System.out.println(area);
    	return area;
    }
    float calculateCircleCircumference() {
    	float perimeter = 2 * pi * radius;
    	System.out.println(perimeter);
        return perimeter;
    }
    public static void main(String[] args) {
    Circle c3 = new Circle(1,2);
    c3.calculateCircleArea();
    c3.calculateCircleCircumference();
    
}
}