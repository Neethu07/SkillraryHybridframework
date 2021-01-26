package com.sogeti.demo;

public class Constructor {
	int id;
	String name;
	
	Constructor(int id,String name){
		this.id=id;
		this.name=name;
	}

	 void display() {
		 System.out.printf("id: " , + id  +" name " +  name);
	 }
	public static void main(String[] args) {
		Constructor con = new Constructor(5,"neethu");
		
		con.display();

	}

}
