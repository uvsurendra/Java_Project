package com;

public  class Methods {
	
	int a=25;
	static int b=67;
	
	 static int add(int a,int b) {
		int c=a+b;
		return c;
		
	}

	public static void main(String[] args) { 
		
		Methods m=new Methods();
		int x=add(m.a, b);
		System.out.println(x);
		
	}

}
