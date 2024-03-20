package ciya_120;

public abstract class ShapeRBCA22120 {
		abstract double calculateArea();
		abstract double calculatePerimeter();
		}
		class Circle extends ShapeRBCA22120 {
			public double radius;
			public Circle(double radius) {
				this.radius = radius;
		}
		@Override
		double calculateArea() {
			return radius * radius;
		}
		@Override
		double calculatePerimeter() {
			return 2 * radius;
		}
		}
		class Triangle extends ShapeRBCA22120 {
			public double side1;
			public double side2;
			public double side3;
			public Triangle(double side1, double side2, double side3) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		
		}
		@Override
		double calculateArea() {
			double s = (side1 + side2 + side3) / 2;
			return (s * (s - side1) * (s - side2) * (s - side3));
		}
		@Override
		double calculatePerimeter() {
			return side1 + side2 + side3;
		}
		}
