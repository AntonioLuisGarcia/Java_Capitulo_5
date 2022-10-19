// Ejercicio 25
// Realiza un programa que pida un número por teclado y que luego muestre ese
// número al revés.

import java.util.Scanner;
public class ejercicio25{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa le darmeos la vuelta a un numero introducido");
        System.out.println("Introduzca el numero");
        int numero= sc.nextInt();
        while(numero>=1){
            System.out.print(numero%10);
            numero=numero/10;
        }
        sc.close();
        }
	}