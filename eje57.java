// Ejercicio 57
// Realiza un programa que pinte un triángulo hueco tal como se muestra en los
// ejemplos. El usuario debe introducir la altura de la figura.

import java.util.Scanner;
public class eje57{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos un triangulo hueco ");
        System.out.println("Diga la altura ");
        int altura = sc.nextInt();
        for(int i=1;i<=altura;i++){
            for(int j=altura-i;j<altura-1;j++){
                System.out.print(" ");
            }

            if(i==altura || i==1){
                for(int k=1;k<=altura-i+1;k++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int k=1;k<=altura-i-1;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        } 
        sc.close();
        }
	}
