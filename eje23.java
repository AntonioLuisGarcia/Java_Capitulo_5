// Ejercicio 23
// Escribe un programa que permita ir introduciendo una serie indeterminada
// de números mientras su suma no supere el valor 10000. Cuando esto último
// ocurra, se debe mostrar el total acumulado, el contador de los números
// introducidos y la media.

import java.util.Scanner;
public class eje23{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa podras ir dando numeros que seran sumados hasta llegar a 10000");
        double suma=0;
        int contador=0;
        while(suma<=10000){
        System.out.println("Diga un numero");
        int numero= sc.nextInt();
        suma=suma+numero;
        contador++;
    }
        System.out.println("El total es "+suma+", has introducido "+contador+" numeros y la media es "+suma/contador);
        sc.close();
        }
	}