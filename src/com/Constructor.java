package com;

public class Constructor {
	//Hai Surendra
//public static void suri() {
	//System.out.println("unygbrg");
//}
	 Constructor( ){
		
		int a=18;
		int b=67;
		int c= a+b;
		System.out.println(c);
	}
     Constructor(int a, float b){
		 this();
		 float  d= a+b;
		 System.out.println(d);
	 }
	 
	  public static void main(String[] args) {
		//Constructor c= new Constructor(45,87.78f);
     // suri();
		new Constructor(45,87.78f);
		//new Constructor();
		
	}

}
