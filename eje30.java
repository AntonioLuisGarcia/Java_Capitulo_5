// Ejercicio 30
// Realiza una programa que calcule las horas transcurridas entre dos horas de
// dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
// El día de la semana se puede pedir como un número (del 1 al 7) o como una
// cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
// los datos correctamente y que el segundo día es posterior al primero.

import java.util.Scanner;
public class eje30{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dara las horas que hay entre dos dias de la semana ");
        System.out.println("Dia: ");
        String dia1=sc.next();
        int ndia1=1;//lo usaremos para saber el dia de la semana y usarlo en el bucle
        System.out.println("Hora: ");
        int hora1=sc.nextInt();
        System.out.println("Dia: ");
        String dia2=sc.next();
        int ndia2=0;//lo usaremos para saber el dia de la semana y usarlo en el bucle
        System.out.println("Hora: ");
        int hora2=sc.nextInt();
        int horas=24-hora1+hora2;


        if(hora1>24 || hora2>24){
            switch(dia1){
                case "lunes":
                    ndia1=1;
                break;

                case "martes":
                    ndia1=2;
                break;

                case "miercoles":
                ndia1=3;
                break;

                case "jueves":
                    ndia1=4;
                break;

                case "viernes":
                    ndia1=5;
                break;

                case "sabado":
                    ndia1=6;
                break;

                case "domingo":
                    ndia1=7;
                break;

            }

            switch(dia2){
                case "lunes":
                    ndia2=1;
                break;

                case "martes":
                    ndia2=2;
                break;

                case "miercoles":
                    ndia2=3;
                break;

                case "jueves":
                ndia2=4;
                break;

                case "viernes":
                    ndia2=5;
                break;

                case "sabado":
                    ndia2=6;
                break;

                case "domingo":
                    ndia2=7;
                break;

            }

            while(ndia1+1<ndia2){
                horas=horas+24;
                ndia1++;
            }

            System.out.print("Entre las "+hora1+":00h del "+dia1+" y las "+hora2+":00h del "+dia2+" hay "+horas+" horas");
        }
        
		sc.close();
	}
}