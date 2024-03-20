package ciya_120;

public class VehicleRBCA22120 {
	    private int horsepower;

	    // Constructor for Vehicle class
	    public VehicleRBCA22120(int horsepower) {
	        this.horsepower = horsepower;
	    }

	    // Method to drive the vehicle
	    public void drive() {
	        System.out.println("Vehicle is being driven with " + horsepower + " horsepower.");
	    }
	}

	class Car extends VehicleRBCA22120 {
	    private int carHorsepower;

	    // Constructor for Car class
	    public Car(int horsepower, int carHorsepower) {
	        super(horsepower); // Calling superclass constructor
	        this.carHorsepower = carHorsepower;
	    }

	    // Overriding drive method to include car-specific details
	    @Override
	    public void drive() {
	        super.drive(); // Calling superclass method
	        System.out.println("Car is being driven with " + carHorsepower + " horsepower.");
	    }
	}

	

