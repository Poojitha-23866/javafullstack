package com.tnsif.day7;

class Student {
    
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class SetterGetter {
    public static void main(String[] args) {
     
        Student s1 = new Student();

        s1.setId(101);
        s1.setName("Arjun");

        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
    }
}
