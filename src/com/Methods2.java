package com;

public class Methods2 {
	
	int add(int a, int v) {
		int f=a+v;
		return f;
		
	}

	public static void main(String[] args) {
		
	Methods2 m=new Methods2();
	int a=m.add(56,69);
	 if(a==145){
		 System.out.println("145");
			 
	 }
	 else {
		 
		 System.out.println(a);
		 
	 }
	}

}
