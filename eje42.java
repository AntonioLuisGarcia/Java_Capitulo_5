// Ejercicio 42
// Escribe un programa que pida un número entero positivo por teclado y que
// muestre a continuación los 5 números consecutivos a partir del número
// introducido. Al lado de cada número se debe indicar si se trata de un primo
// o no.
import java.util.Scanner;
public class eje42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra si los siguientes 5 numeros de uno introducido por teclado son primos");
        boolean primo; 
        System.out.println("Escriba el numero");
        int numero=sc.nextInt(); 


        for(int i=1;i<=5;i++){

            primo=true;

            for(int j=2;j<numero-1 && primo;j++){
    
                if(numero%j==0){
                    primo=false;
                }else{
                    primo=true;
                }
            }

            if(primo){
                System.out.println(numero+" es primo");
            }else{
                System.out.println(numero+" no es primo");
            }

            numero++;
        }
        
        sc.close();
	}
}