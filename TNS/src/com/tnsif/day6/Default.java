package com.tnsif.day6;

	class Sample {

		Sample (){

		System.out.println("This is a constructor");

		}

		public void show1() {

		System.out.println ("This is a method");

		}
	}

		public class Default{

		public static void main(String[]args) {

		Sample ob = new Sample ();

		ob.show1();
		}
		}