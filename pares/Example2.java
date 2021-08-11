package com;

public class Example2 {
	public static void main(String[] args) {
		int n = 6;
		Example2.mostrarNumerosPares1(n);
	}
	public static void mostrarNumerosPares1(int n) {
		int limite = (n*2 + 1);
		for(int i = 0; i < limite ; i++) {
			if(i % 2 == 0) {
				if(i > 0)
					System.out.println(i);
			}
		}
	}
}
