// Ejercicio 47
// Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
// encargado realizar un programa que pinte un 8 por pantalla usando la letra
// M. Se pide al usuario la altura, que debe ser un número entero impar mayor
// o igual que 5. Si el número introducido no es correcto, el programa deberá
// mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
// La anchura de la figura siempre será de 6 caracteres.

import java.util.Scanner;
public class eje47{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa haremos un 8 con M ");
        System.out.println("Diga la altura");
        int altura=sc.nextInt();

        if(altura%2==0 || altura<5){
            System.out.print("Debe de introducir un numero impar mayor que 5");
        }else{
            System.out.print("MMMMMM");
            System.out.println("");
            for(int i=1;i<=altura/3;i++){
                System.out.print("M");
                for(int j=1;j<=4;j++){
                    System.out.print(" ");
                }
                System.out.print("M");
                System.out.println("");
            }
            System.out.print("MMMMMM");
            System.out.println("");
            for(int i=1;i<=altura/3;i++){
                System.out.print("M");
                for(int j=1;j<=4;j++){
                    System.out.print(" ");
                }
                System.out.print("M");
                
                System.out.println("");
            }
            System.out.print("MMMMMM");
            System.out.println("");
        }
        sc.close();
        }
	}