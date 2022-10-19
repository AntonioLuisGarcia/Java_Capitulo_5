// Ejercicio 41
// Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
// hay dentro de un número. Se recomienda usar long en lugar de int ya que el
// primero admite números más largos.

import java.util.Scanner;
public class eje41{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa te dira cuantos numeros pares e impares tiene tu numero");
    System.out.println("Introduzca el numero");
    long numero= sc.nextLong();
    long numero2= numero;
    int nimpares=0;
    int npares=0;
    while(numero>0){
        if((numero%10)%2==0){
            npares++;
        }else{
            nimpares++;
        }
        numero/=10;
    }
    System.out.println("El "+numero2+" tiene "+npares+" numeros pares y "+nimpares+" impares");
    sc.close();
}
}
