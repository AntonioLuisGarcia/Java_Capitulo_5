// Ejercicio 31
// Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
// programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
// mitad (división entera entre 2) de la altura más uno.

import java.util.Scanner;
public class eje31{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa sirve para escribir una L con asteriscos ");
        System.out.print("Diga la altura:");
        int altura=sc.nextInt();
        
        
		sc.close();
	}
}