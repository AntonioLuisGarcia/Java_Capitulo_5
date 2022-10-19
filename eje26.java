// Ejercicio 26
// Realiza un programa que pida primero un número y a continuación un dígito.
// El programa nos debe dar la posición (o posiciones) contando de izquierda a
// derecha que ocupa ese dígito en el número introducido.

import java.util.Scanner;
public class eje26{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa podremos decir las veces que un numero se repite dentro de otro");
        System.out.println("Introduce un numero");
        int numero=sc.nextInt();
        System.out.println("Introduce el numero que quieres saber su posicion y cuanto se repite");
        int contador=0;
        int posicion=0;
        int n=sc.nextInt();//esta variable es para saber que numero queremos contar o buscar
        
        System.out.print(n+" esta en las posiciones: ");

        while(numero>=1){
            posicion++;
            if(numero%10==n){
                contador++;
                System.out.print(posicion+",");
            }
            numero=numero/10;
        }
        System.out.println("");
        System.out.println(n+" se repite "+contador+" veces");
        
        sc.close();
        }
	}