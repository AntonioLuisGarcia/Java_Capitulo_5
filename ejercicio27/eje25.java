import java.util.Scanner;
public class eje25{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y calcure los multiplos de 3 que tiene ");
        int numero= sc.nextInt();
        int i=1;
        int contador=0;
        int total=0;
        while(i<=numero){

            if(i%3==0){
                System.out.print(i+", ");
                contador++;
                total=total+i;
            }
            i++;
        }

        System.out.println(" ");
        System.out.println("Tenemos "+contador+" multiplos de 3");
        System.out.println("El total de la suma de los multiplos es "+total);

        sc.close();
        }
	}