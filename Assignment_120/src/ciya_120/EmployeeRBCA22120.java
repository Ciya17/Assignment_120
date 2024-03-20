package ciya_120;

public class EmployeeRBCA22120 {
	    private String name;
	    private String jobTitle;
	    private double salary;

	    // Constructor
	    public EmployeeRBCA22120(String name, String jobTitle, double salary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.salary = salary;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public String getJobTitle() {
	        return jobTitle;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // Method to calculate DA
	    public double calculateDA() {
	        return 0.10 * salary; // DA is 10% of basic salary
	    }

	    // Method to calculate total salary
	    public double calculateTotalSalary() {
	        double da = calculateDA();
	        double hra = 5000;
	        return salary + da + hra;
	    }

	    // Method to update salary
	    public void updateSalary(double newSalary) {
	        salary = newSalary;
	    }
	}


