package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstname;
	private String lastname;
	private int year;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int cost_of_course = 600;
	private static int id = 1000;
	
	//Constructor prompts user to enter student's name and year
	public Student()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student's first name: ");
		this.firstname = sc.nextLine();
		System.out.print("Enter student's last name: ");
		this.lastname = sc.nextLine();
		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's year: ");
		this.year = sc.nextInt();
		setStudentID();
	}
	
	//Generate an id
	
	private void setStudentID()
	{
		id++;
		//Year + ID
		this.studentID = year + "" + id;
	}
	
	//Enroll in courses
	
	public void enroll()
	{
		//Get inside a loop, user hits Q to quit
		do{
			
			System.out.print("Enter course to enroll,Q to quit: ");
		    Scanner sc = new Scanner(System.in);
		    String course = sc.next();
		    if(!course.equals("Q"))
		      {
			    this.courses = this.courses + "\n" + course;
			    tuitionBalance = tuitionBalance + cost_of_course;
		      }
		    else {break;}
		}while(true);
			
	}
	//View Balance
	public void viewBalance()
	{
		System.out.println("Your balance is: Rs"+ tuitionBalance);
		
	}
	
	//Pay tuition fee
	public void payTuition()
	{
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your payment Rs ");
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of Rs" + payment);
		viewBalance();
	}
	
	//print status
	public String toString()
	{
		return "Name: "+firstname+" "+lastname+
				"\nYear: "+year+
				"\nStudent ID: "+studentID+
				"\nCourses enrolled: "+courses + 
				"\nBalance is: "+tuitionBalance; 
	}
	

}
