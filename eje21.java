import java.util.Scanner;
public class eje21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa va pidiendo números hasta que se introduzce un numero negativo y te dira cuantos números se han introducido, la media de los impares y el mayor de los pares");
        System.out.print("Introduce un numero");
        boolean salir= true;
        int contador=0;
        int total_impar=0;
        int cont_impar=0;
        int par_mayor=0;
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
        if(numero%2==0 && numero>par_mayor){
            par_mayor=numero;
        }
        contador++;
    }
    System.out.println("Se han introducido "+contador+" numeros");
    System.out.println("La media de los impares es "+total_impar/cont_impar);
    System.out.println("El mayor numero par es "+par_mayor);
        
    sc.close();
}
}