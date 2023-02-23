package com;

public class AccessModifiersDemo {
	public static int[] numbers() {
		int[] i=new int[5]; 
		i[0]=56;
		i[1]=98;
		i[2]=67;
		i[1]=456;
		i[3]=679;
		return i;
		
	}

	public static void main(String[] args) {
		int[] i= numbers();
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		
	}

}
