package com.tnsif.day5;

class Parent{
	protected void display()//accessible in same package and child classes (of different packages)
	{
		System.out.println("Protected Method");
	}
}
public class Protected extends Parent{

	public static void main(String[] args) {
		Protected obj=new Protected();
		obj.display();
		

	}

}