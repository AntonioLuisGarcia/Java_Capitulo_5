// Ejercicio 49
// Realiza un programa que calcule el máximo, el mínimo y la media de una serie
// de números enteros positivos introducidos por teclado. El programa terminará
// cuando el usuario introduzca un número primo. Este último número no se
// tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
// números ha introducido el usuario (sin contar el primo que sirve para salir).

import java.util.Scanner;
public class eje49{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numeros, se acaba cuando introduzcas un numero primo ");
        
        boolean noprimo=true;
        boolean seguir=true;
        int contador=0;
        int total=0;
        int max=0;
        int min=1264983232;
        
        while(noprimo){

            System.out.println("Diga un numero ");
            int numero=sc.nextInt();

            for(int i=2;i<numero/2;i++){
                if(numero%i==0){
                    seguir=true;
                    break;
                }
            }
            if(noprimo){
                System.out.println(numero);
                contador++;
                total=total+numero;
                if(numero>max){
                    max=numero;
                }
                if(numero<min){
                    min=numero;
                }
            }
        }
        System.out.println("Has metido "+contador+" numeros primos");
        System.out.println("La media es "+total/contador);
        System.out.println("El numero maximo es "+max);
        System.out.print("El numero minimo es "+min);

        sc.close();
        }
	}
