package com.test;

public class Student {

	public Student () {
		System.out.println("hi , i am inside constructor");
		System.out.println("hi , i am second method");
		
	}
	int rollnumber;
	String name;
	public Student(int i, String n){
		rollnumber = i;
		name = n;
	}
	public void display(){
		System.out.println("roll number is : " +rollnumber +" and name is : " + name  );
	}
	public static void main(String[] args) {
		Student std = new Student();

		Student std1 = new Student(10 , "james");
		Student std2 = new Student(20 , "natalia");
		
		std1.display();
		std2.display();
		
		
	}

}
