package com;
public class Example5 {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			int numero = Example5.fibonacci(i);
			System.out.println(numero);
		}
	}
	public static int fibonacci(int n) {
	    if (n <= 2) {
	        return n - 1;
	    }
	    return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
