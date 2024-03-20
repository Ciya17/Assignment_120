package ciya_120;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeRBCA22120Test {

	@Test
    public void testCalculateDA() {
        EmployeeRBCA22120 employee = new EmployeeRBCA22120("John Doe", "Software Engineer", 50000);
        double da = employee.calculateDA();
        assertEquals(5000, da, 0.01); // Assuming salary is 50000, DA should be 10% of salary = 5000
    }

}
