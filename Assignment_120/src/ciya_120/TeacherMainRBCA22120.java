package ciya_120;

import java.util.Scanner;

public class TeacherMainRBCA22120 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Getting teacher's name from the user
	        System.out.print("Enter teacher's name: ");
	        String teacherName = scanner.nextLine();

	        // Creating teacher object
	        teacherTeaches teacher = new teacherTeaches(teacherName);

	        // Getting subject from the user
	        System.out.print("Enter the subject taught by the teacher: ");
	        String subject = scanner.nextLine();

	        // Calling method to specify subjects
	        teacher.Subjects(subject);

	        scanner.close();
	    }
	}


