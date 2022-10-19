// Ejercicio 28
// Escribe un programa que calcule el factorial de un número entero leído por
// teclado.

import java.util.Scanner;
public class eje28{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("¿De que numero quieres el factorial? ");
        int numero = sc.nextInt();
        int cont=1;
        for(int i= 1;i<=numero;i++){
            cont= cont*i;
        }
        System.out.print("el factorial es "+ cont);
		sc.close();
	}
}