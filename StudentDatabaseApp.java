package studentdatabaseapp;

import java.util.*;

public class StudentDatabaseApp {
	
	public static void main(String[] args)
	{
		
		
		//how many students do you want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int num_of_students = sc.nextInt();
		Student[] students = new Student[num_of_students]; 
		
		//Create n number of students
		for(int i =0; i<num_of_students; i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}
		
	}

}
