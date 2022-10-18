import java.util.Scanner;
public class eje8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero y positivo y te dire la tabla de multiplicacion de el");
        int numero=sc.nextInt();
        for(int i=2;i<10;i++){
                System.out.println(numero*i);
        }
        sc.close();
	}
}