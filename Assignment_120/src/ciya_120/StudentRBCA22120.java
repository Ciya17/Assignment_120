package ciya_120;

public class StudentRBCA22120 {
	    private String name;
	    private int age;
	    private String address;

	    // Constructor with default values
	    public StudentRBCA22120() {
	        this.name = "unknown";
	        this.age = 0;
	        this.address = "not available";
	    }

	    // Method to set name and age
	    public void setInfo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to set name, age, and address
	    public void setInfo(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    // Method to print student information
	    public void printInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        // Creating instances of Student class
	        StudentRBCA22120 student1 = new StudentRBCA22120();
	        StudentRBCA22120 student2 = new StudentRBCA22120();
	        StudentRBCA22120 student3 = new StudentRBCA22120();

	        // Setting information for each student
	        student1.setInfo("John", 20, "Margao");
	        student2.setInfo("Alice", 22, "Navelim");
	        student3.setInfo("Bob", 21, "Benaulim");

	        // Printing information of each student
	        System.out.println("Student 1:");
	        student1.printInfo();

	        System.out.println("Student 2:");
	        student2.printInfo();

	        System.out.println("Student 3:");
	        student3.printInfo();
	    }
	}



