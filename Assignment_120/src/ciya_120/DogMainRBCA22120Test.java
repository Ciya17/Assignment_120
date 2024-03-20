package ciya_120;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogMainRBCA22120Test {

	 @Test
	    public void testDog() {
	        DogRBCA22120 dog = new DogRBCA22120("Buddy", "Labrador");
	        assertEquals("Buddy", dog.getName());
	        assertEquals("Labrador", dog.getBreed());
	    }
}
