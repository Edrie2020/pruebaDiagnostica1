/*
*	Suma de impares
*   Parte 1
*	Deberan crear un programa donde se sumen todos los valores 
*   impares desde 0 hasta n, donde sea ingresado por el usuario
*/

//Nota: en este programa los datos de entrada se establecen quemados en la variable n
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
			//Se valida la condicion para que sume los numeros impares
			if(!(i % 2 == 0)) {
				sumatoria = sumatoria + i;
			}
		}
		return sumatoria;
	}
}
