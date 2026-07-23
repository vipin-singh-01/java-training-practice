package com.test;

public class StudentDemo {
        int rollnumber;
        String name;
        String Standard;
        
        public StudentDemo(int i, String n, String s){
        	rollnumber = i;
        	name = n;
        	Standard = s;
        }
        
        public void display() {
        System.out.println("Student roll number:"+rollnumber+"name is:"+name+"and is class:"+Standard);

        }
        
	public static void main(String[] args) {
		
		StudentDemo std = new StudentDemo(10, "vipin","2nd");
		
		StudentDemo std1 = new StudentDemo(20, "sachin","5th");
		
		std.display();
		std1.display();

	}

}
