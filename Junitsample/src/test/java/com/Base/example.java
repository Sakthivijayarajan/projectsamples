package com.Base;

public class example {
	
	public static void main(String[] args) {
		
	
	
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= 20; i++) {
			c = a + b;// c=2
			if (c <= 10) {
				System.out.println(c);
				a = b;// a=1
				b = c;// b=2
	}

}
	}
}
