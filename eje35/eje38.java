// Ejercicio 38
// Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
// programa debe pedir la altura. Se debe comprobar que la altura sea un número
// impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

import java.util.Scanner;
public class eje38{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la X ");
        int altura= sc.nextInt();
        int j=0;
        int g=0;

        if(altura>4 || altura%2!=0){
            for(int i=1;i<=altura;i++){

                while(j>0){
                    System.out.print(" ");
                    j--;
                }
                System.out.print("*");

                for(int k=1;k<=altura-i;k++){
                    System.out.print("*");
                }
                for(int k=1;k<altura-i;k++){
                    System.out.print("*");
                }
                if(altura!=i){
                System.out.println("*");
                }
                j=i;

            }


            for(int i=1;i<=altura;i++){

                while(g<altura-2){
                    System.out.print(" ");
                    g++;
                }
                if(i!=1){
                System.out.print("*");
                }

                for(int k=altura;k>altura-i+2;k--){
                    System.out.print("*");
                }

                for(int k=altura;k>=altura-i+2;k--){
                    System.out.print("*");
                }
            
                if(i!=1){
                System.out.print("*");
                }
                g=i-1;
                System.out.println("");
            }

        }
        sc.close();
        }
}