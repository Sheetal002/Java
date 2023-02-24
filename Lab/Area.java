package com.cognizant.shapes;

class Area {
    public static void main(String[] args){
        Circle Constructor2 = new Circle(2); //invoking constructor1 created in other package from this one
        //Calling methods
        Constructor2.calculateCircleArea();
        Constructor2.calculateCircleCircumference();
    }
}
