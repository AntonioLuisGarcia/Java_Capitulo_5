// Ejercicio 29
// Escribe un programa que muestre por pantalla todos los números enteros
// positivos menores a uno leído por teclado que no sean divisibles entre otro
// también leído de igual forma.

import java.util.Scanner;
public class eje29{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("ESte programa sirve para dar todos los numeros menores a un numero dado por teclado y que no sean divisibles entre otro dado por teclado ");
        System.out.println("diga el numero mayor ");
        int mayor = sc.nextInt();
        System.out.println("diga el numero del qie no pueden ser divisibles ");
        int divisor=sc.nextInt();

        while(mayor>0){
            mayor--;
            if(mayor%divisor!=0){
                System.out.print(mayor+", ");
            }
        }
        
		sc.close();
	}
}