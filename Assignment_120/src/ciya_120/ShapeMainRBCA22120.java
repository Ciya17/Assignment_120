package ciya_120;

public class ShapeMainRBCA22120 {
	    public static void main(String[] args) {
	    double r = 2;
	    Circle circle = new Circle(r);
	    double t1 = 3, t2 = 4, t3 = 5;
	    Triangle triangle = new Triangle(t1, t2, t3);
	    System.out.println("Radius of the Circle " +r);
	    System.out.println("Area of the Circle: " + circle.calculateArea());
	    System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());
	    System.out.println("\nSides of the Traiangel are:"+t1+','+t2+','+t3);
	    System.out.println("Area of the Triangle: " +triangle.calculateArea());
	    System.out.println("Perimeter of the Triangle: " +triangle.calculatePerimeter());
	    }
}

