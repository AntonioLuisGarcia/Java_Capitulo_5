import java.util.Scanner;
public class ejercicio17{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero y positivo y te dire la suma de los 100 siguientes numeros");
        int numero=sc.nextInt();
        int total=0;
        int i=1;
        for(i=1;i<101;i++){
            if(numero<0){
                i=i+105;
                System.out.print("EL NUMERO TIENE QUE SER POSITIVO!!!!");
            }
            total=total+i;
        }
        if(i<104){
            System.out.print("el total es "+(total+numero));
        }
		sc.close();
	}
}