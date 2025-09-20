package com.tnsif.day5;

class Example1{
	public int data=50;//can be accessed from anywhere(any class,any package)
	public void show() 
	{
		System.out.println("Public Method");
	}
}

public class Public{

	public static void main(String[] args) {
		Example1 e=new Example1();
		System.out.println(e.data);
		e.show();

	}

}