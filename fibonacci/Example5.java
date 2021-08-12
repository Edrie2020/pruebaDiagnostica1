/*
*   Secuencia de Fibonacci.
*	
*	Se debe crear un programa que reciba un numero ingresado por el usuario,
*	que indique cuantos elementos de la serie de Fibonacci, y el programa debe mostrar
*   los primeros n numeros de la secuencia de Fibonacci. 	
*/
public class Example5 {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			int numero = Example5.fibonacci(i);
			//se imprime el numero.
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
