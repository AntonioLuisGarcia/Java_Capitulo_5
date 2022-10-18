import java.util.Scanner;
public class eje11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero y te dire el valor del cubo y cuadrado de ese numero");
        int numero=sc.nextInt();
        System.out.printf("%-8s %-10s %-10s","Numero", "Cuadrado","Cubo");
        System.out.println();
        for(int i=1;i<=5;i++){
            
            System.out.printf("%-8s %-10s %-10s",numero,numero*numero,numero*numero*numero);
            System.out.println();
            numero++;
        }
        sc.close();
	}
}