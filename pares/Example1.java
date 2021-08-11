package com;
/*
*	Deberan crear un programa, el cual debera recibir un parametro n ingresado por el usuario, 
*   y mostrar los primeros n pares.
*/
public class Example1 {
	public static void main(String[] args) {
		int n = 6;

		Example1.mostrarNumerosPares(n);
	}

	//Creamos el metodo estatico mostrarNumerosPares
	public static void mostrarNumerosPares(int n) {	
		// n*2 multiplicamos n * 2 ============
		for(int i = 0; i < n*2; i++) {

			//condicion que verifica si un numero es par
			if(i % 2 == 0) {
				//aqui mostrarmos por consola los numero pares
				System.out.println(i);
			}
		}
	}
}
