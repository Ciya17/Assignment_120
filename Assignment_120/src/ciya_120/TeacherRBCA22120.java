package ciya_120;
import java.util.Scanner;

public class TeacherRBCA22120 {
	
	    protected String type;

	    // Constructor
	    public TeacherRBCA22120() {
	        this.type = "Teacher";
	    }

	    // Method to indicate teaching
	    public void Teaches() {
	        System.out.println("The " + type + " is teaching");
	    }
	}

	// Subclass teacherTeaches
	class teacherTeaches extends TeacherRBCA22120 {
	    private String name;

	    // Constructor
	    public teacherTeaches(String name) {
	        super();
	        this.name = name;
	    }

	    // Method to specify subjects
	    public void Subjects(String subject) {
	        System.out.println("The " + type + " " + name + " is teaching " + subject);
	    }
	}

	



