package ciya_120;

public class DogMainRBCA22120 {
	    public static void main(String[] args) {
	        // Creating two instances of the Dog class
	        DogRBCA22120 dog1 = new DogRBCA22120("Buddy", "Labrador");
	        DogRBCA22120 dog2 = new DogRBCA22120("Max", "Golden Retriever");

	        // Printing initial values
	        System.out.println("Initial values:");
	        System.out.println("Dog 1: Name - " + dog1.getName() + ", Breed - " + dog1.getBreed());
	        System.out.println("Dog 2: Name - " + dog2.getName() + ", Breed - " + dog2.getBreed());

	        // Modifying attributes using setter methods
	        dog1.setName("Charlie");
	        dog2.setBreed("German Shepherd");

	        // Printing updated values
	        System.out.println("\nUpdated values:");
	        System.out.println("Dog 1: Name - " + dog1.getName() + ", Breed - " + dog1.getBreed());
	        System.out.println("Dog 2: Name - " + dog2.getName() + ", Breed - " + dog2.getBreed());
	    }
	}



