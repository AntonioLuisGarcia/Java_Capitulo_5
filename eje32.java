// Ejercicio 32
// Escribe un programa que, dado un número entero positivo, diga cuáles son y
// cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
// izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
// números largos.


import java.util.Scanner;
public class eje32{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dira la suma de los numeros pares que tiene un numero dado por teclado");
        int numero= sc.nextInt();
       
        
		sc.close();
	}
}