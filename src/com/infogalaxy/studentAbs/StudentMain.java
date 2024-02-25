package com.infogalaxy.studentAbs;

import java.util.Scanner;

public class StudentMain {
	
	StudentModel studentModel = new StudentModel();
	
	public void setStudent() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Roll No :");
		studentModel.setRollno(scanner.nextInt());
		System.out.println("Enter the Student Name :");
		studentModel.setSname(scanner.next());
		System.out.println("Enter the Mobile No :");
		studentModel.setMobno(scanner.next());
		System.out.println("Enter the PRN no : ");
		studentModel.setPrnno(scanner.next());
		System.out.println("Enter the Email :");
		studentModel.setEmail(scanner.next());
	}
	public void getStudent() {
		System.out.println("Student Roll No :"+studentModel.getRollno());
		System.out.println("Student Name :"+studentModel.getSname());
		System.out.println("Mobile No :"+studentModel.getMobno());
		System.out.println("PRN No :"+studentModel.getPrnno());
		System.out.println("Email :"+studentModel.getEmail());
	}

	public static void main(String[] args) {
		StudentMain studentMain = new StudentMain();
		studentMain.setStudent();
		studentMain.getStudent();
		

	}

}
