import java.util.Scanner;
public class eje21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Este programa va pidiendo números hasta que se introduzce un numero negativo y te dira cuantos números se han introducido, la media de los impares y el mayor de los pares");
        System.out.print("Introduce un numero");
        boolean salir= true;
        int contador=0;
        int total_impar=0;
        int cont_impar=0;
        while(salir){
            int numero=sc.nextInt();
        if(numero<0){
            salir=false;
            break;
        }
        if(numero%2!=0){
            total_impar=total_impar+numero;
            cont_impar++;
        }
        if(numero%2==0){
            
        }
        contador++;
    }
    System.out.print("Se han introducido "+contador+" numeros");
    System.out.print("La media de los impares es "+total_impar/cont_impar);
        
    sc.close();
}
}