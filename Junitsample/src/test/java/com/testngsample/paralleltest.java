package com.testngsample;

public class paralleltest {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.test1(); // main method thread
		b.start();
	}
}

class A {
	public void test1() {
		System.out.println(Thread.currentThread().getId());
		for (int i = 1; i <= 5; i++) {
			System.out.println("test1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}
}

class B extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getId());
		for (int i = 1; i <= 5; i++) {
			System.out.println("test2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}
