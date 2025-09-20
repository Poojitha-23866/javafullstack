package com.tnsif.day6;
	// Example of Parameterized Constructor
	class Student {
	    String name;
	    int age;

	    // Parameterized constructor
	    Student(String n, int a) {
	        name = n;
	        age = a;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	}

	public class Parameterized {
	    public static void main(String[] args) {
	        // Creating objects using parameterized constructor
	        Student s1 = new Student("Rohit", 21);
	        Student s2 = new Student("Poojitha", 20);

	        s1.display();
	        s2.display();
	    }
	}