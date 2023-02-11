class Calc_Area{
	//calculate circle
	public double area(double radius){
		return(3.14 * radius * radius);
	}
	//calculate rectangle
	public double area(double length, double breadth){
		return(length * breadth);
	}
	//calculate 
	public double area(double side1,double side2, double height){
		return(0.5*(side1+side2)*height);
	}

}
class OverloadingExample{
	public static void main(String[] args){
		Calc_Area c = new Calc_Area();
		System.out.println("Area of Circle: "+c.area(3.5));
		System.out.println("Area of Rectangle: "+c.area(4.5,5.5));
		System.out.println("Area of Trapezium: "+c.area(2.5,1.5));
	}
}