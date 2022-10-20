// Ejercicio 43
// Escribe un programa que permita partir un número introducido por teclado en
// dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
// el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
// el número introducido tiene dos dígitos como mínimo y la posición en la que
// se parte el número está entre 2 y la longitud del número. No se permite en
// este ejercicio el uso de funciones de manejo de String (por ej. para extraer
// subcadenas dentro de una cadena).

import java.util.Scanner;
public class eje43{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa partiremos un numero dado por teclado ");
        System.out.println("Diga el numero ");
        int numero = sc.nextInt();
        int volteado=0;
        System.out.println("Diga la posicion ");
        int partir = sc.nextInt();
        int longitud=1;
        while(numero>=1){
			volteado=(volteado*10)+numero%10;
			numero /=10;
		}
        System.out.print("Los numero partidos son el ");

        while(volteado>0){

            if(longitud==partir){
                System.out.print(" y el ");
            }
            System.out.print((volteado%10));
            volteado/=10;
            longitud++;
        }

        sc.close();
        }
	}