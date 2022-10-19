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
        System.out.println("Introduzca el numero");
        long numero= sc.nextLong();
		long volteado=0;
		int total=0;
		System.out.print("Los numeros pares son: ");
		while(numero>=1){
			volteado=(volteado*10)+numero%10;
			numero /=10;
		}
		while(volteado>=1){
			if((volteado%10)%2==0){
				System.out.print(volteado%10+" ");
				total=total+ (int)(volteado%10);
			}
			volteado /=10;
		}
		System.out.println();
		System.out.print("La suma de los numeros pares es de: "+total);
       
        
		sc.close();
	}
}