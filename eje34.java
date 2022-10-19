// Ejercicio 34
// Escribe un programa que pida dos números por teclado y que luego mezcle en
// dos números diferentes los dígitos pares y los impares. Se van comprobando los
// dígitos de la siguiente manera: primer dígito del primer número, primer dígito
// del segundo número, segundo dígito del primer número, segundo dígito del
// segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
// podemos suponer que el usuario introducirá dos números de la misma longitud
// y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
// int donde sea necesario para admitir números largos.

import java.util.Scanner;
public class eje34{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa mexclara dos numeros dados por teclado");
    System.out.println("Introduzca el primer numero");
    int numero1= sc.nextInt();
    int volteadopar=0;
    int volteado1=0;
    System.out.println("Introduzca el segundo numero");
    int numero2= sc.nextInt();
    int volteadoimpar=0;
    int volteado2=0;
    int contador=0;
    System.out.print("Los numeros pares son: ");
    while(numero1>=1){
            volteado1=(volteado1*10)+numero1%10;
            numero1 /=10;
            contador++;
    }
    while(numero2>=1){
        volteado2=(volteado2*10)+numero2%10;
        numero2 /=10;
    }
    for(int i=1;i<=contador;i++){
        if((volteado1%10)%2==0){
            volteadopar=(volteadopar*10)+volteado1%10;
        }else{
            volteadoimpar=(volteadoimpar*10)+volteado1%10; 
        }
        if((volteado2%10)%2==0){
            volteadopar=(volteadopar*10)+volteado2%10;
        }else{
            volteadoimpar=(volteadoimpar*10)+volteado2%10; 
        }
      volteado1 /= 10;
      volteado2 /= 10;
    }
    
    System.out.println("El numero formado por los numeros pares es: "+volteadopar);
    System.out.print("El numero formado por los numeros impares es: "+volteadoimpar);
    sc.close();
}
}