package com.tnsif.day6;

class Counter {
    
    static int count = 0;

    
    Counter() {
        count++;
    }

   
    static void ShowCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class Static {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        Counter.ShowCount();  
    }
}
