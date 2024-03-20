package ciya_120;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonMainRBCA22120Test {
	@Test
    public void testPerson() {
        PersonRBCA22120 person = new PersonRBCA22120("Alice", 30);
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
    }

}
