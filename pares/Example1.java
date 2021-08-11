package com;
public class Example1 {
	public static void main(String[] args) {
		int n = 6;
		Example1.mostrarNumerosPares(n);
	}
	public static void mostrarNumerosPares(int n) {	
		for(int i = 0; i < n*2; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
