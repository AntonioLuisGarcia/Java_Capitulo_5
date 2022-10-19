// Ejercicio 39
// Escribe un programa que pida un número entero positivo por teclado y que
// muestre a continuación los números desde el 1 al número introducido junto
// con su factorial.

import java.util.Scanner;
public class eje39{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Hasta que numero quieres el factorial? ");
        int numero = sc.nextInt();
        int cont=1;        
        for(int i= 1;i<=numero;i++){
            System.out.print(i+"! =");
            for(int j=1;j<i;j++){
                cont= cont+cont*j;
            }
            System.out.print(cont);
            System.out.println("");
            cont=1;
        }
		sc.close();
	}
}