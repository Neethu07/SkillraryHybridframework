package com.sogeti.demo;

public class ClassStudent {

    int id;
    String name;
     
    void insertRecord(int id, String name) {
    	this.id = id;
    	this.name=name;
    	
    }
    void displayInformation()
        {
        	System.out.println("student id:  " + id +  " and Name:  " + name);
        }
        
        public static void main(String[] args) {
        	ClassStudent student = new ClassStudent();
        	
        	student.insertRecord(1, "Neethu");
        	student.displayInformation();
	}

}
