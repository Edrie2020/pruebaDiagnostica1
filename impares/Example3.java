package com;

public class Example3 {
	public static void main(String[] args) {
		int n = 6;
		int sumatoria = Example3.mostrarNumerosPares1(n);
		System.out.println(sumatoria);
	}
	public static int mostrarNumerosPares1(int n) {
		int limite = n;
		int sumatoria = 0;
		for(int i = 0; i < limite ; i++) {
			if(!(i % 2 == 0)) {
				sumatoria = sumatoria + i;
			}
		}
		return sumatoria;
	}
}
