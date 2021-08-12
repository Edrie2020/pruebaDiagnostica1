/*
*   Parte 2
*	Deberan crear un programa, donde el usuario ingresa dos valores, el limite 
*   inferior(min) y superior(max) del intervalo para realizar la suma
*   de los impares. 
*/
public class Example4 {
	public static void main(String[] args) {
		int n = 6;
		//rango minimo
		int min = 6;
		//rango max
		int max = 30;
		int sumatoria = Example4.mostrarNumerosPares1(n, min, max);
		System.out.println(sumatoria);
	}
	public static int mostrarNumerosPares1(int n,  int min,  int max) {
		int sumatoria = 0;
		for(int i = 0; i < 100 ; i++) {
			//Se verifica que el numero sea impar.
			if(!(i % 2 == 0 )) {
				//S valida que el numero impar 'i' este en el rango min y maximo
				if((  i > min  &&  i < max )) {
					sumatoria = sumatoria + i;
				}
			}
		}
		return sumatoria;
	}
}
