package ConstructorEx;

public class AppCalling {
	public static void main(String[] args) {

		Runnable r1=()->System.out.println("thread started...");
			Thread t1=new Thread(r1);
			t1.start();
	}}