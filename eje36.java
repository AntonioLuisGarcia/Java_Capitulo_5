// Ejercicio 36
// Escribe un programa que diga si un número introducido por teclado es o no
// capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
// programa debe aceptar números de cualquier longitud siempre que lo permita
// el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
// long en lugar de int ya que el primero admite números más largos.

import java.util.Scanner;
public class eje36{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dira si el numero introducido por teclado es capicua o no");
        System.out.println("Introduzca el numero");
        long numero= sc.nextLong();
        long numero1=numero;
		long volteado=0;
		while(numero>=1){
			volteado=(volteado*10)+numero%10;
			numero /=10;
		}
        if(volteado==numero1){
            System.out.print(numero1+" es capicua");
        }else{
            System.out.print(numero1+" no es capicua");
        }
		sc.close();
	}
}