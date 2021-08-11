package com;

public class Example4 {
	public static void main(String[] args) {
		int n = 6;
		int min = 6;
		int max = 30;
		int sumatoria = Example4.mostrarNumerosPares1(n, min, max);
		System.out.println(sumatoria);
	}
	public static int mostrarNumerosPares1(int n,  int min,  int max) {
		int sumatoria = 0;
		for(int i = 0; i < 100 ; i++) {
			if(!(i % 2 == 0 )) {
				if((  i > min  &&  i < max )) {
					sumatoria = sumatoria + i;
				}
			}
		}
		return sumatoria;
	}
}
