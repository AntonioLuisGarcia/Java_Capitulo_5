// Ejercicio 61
// Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
// la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
// mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
// debe mostrar un mensaje de error.

import java.util.Scanner;
public class eje61{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa te dire si tu numero es de la suerte o no ");
        System.out.println("Diga un numero");
        int numero=sc.nextInt();

       
        sc.close();
        }
	}