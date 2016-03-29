package monolitico;

import java.util.Scanner;

/**
 * @author Laura Martínez Patón
 * @version 3.0
 * @since 24/03/2016
 * juego para adivinar un número generado aleatoriamente del 0 al 499
 * 
 */
public class Aciertos {

    /**
     * @param args metodo main
     */
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            pideNumero();
            n = sc.nextInt();
            comparar(n, x);
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );

    }

	/**
	 * 
	 * @param n valor introducido por teclado
	 * @param x valor aleatorio generado por el programa
	 * @return devuelve true si el resueltado es correcto o false si no lo es
	 */
	public static boolean comparar(int n, int x) {
		if (n > x) {
		    System.out.print("Te pasaste Amigo");
		    return false;
		} else if (n < x){
		    System.out.print("Casi cerca ...");
		    return false;
		}
		return true;
	}

	
	/**
	 * Metodo que imprime el texto para introducir el numero
	 */
	
	private static void pideNumero() {
		System.out.print("\nIntroduce el valor de X: ");
	}
}
