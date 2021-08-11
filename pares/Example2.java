/*
*   Parte 2
*	Deberan crear un programa, el cual debera recibir un parametro n ingresado por el usuario, 
*   y mostrar los primeros n pares.
*/
public class Example2 {
	public static void main(String[] args) {
		int n = 6;
		Example2.mostrarNumerosImpares(n);
	}
	public static void mostrarNumerosImpares(int n) {
		//establecemos el limite del for, sumamos 1 para limitar el for a 13 ya que el 
		//0 corresponde a la posicion incial que es cero
		int limite = (n*2 + 1);
		for(int i = 0; i < limite ; i++) {
			//condicion que verifica si un numero es par
			if(i % 2 == 0) {
				//Se verifica que el numero par sea mayor a 0 para imprimirlo por consola
				if(i > 0)
					System.out.println(i);
			}
		}
	}
}
