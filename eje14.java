import java.util.Scanner;
public class eje14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te permite hacer una potencia");
        System.out.println("Diga la base");
        int base=sc.nextInt();
        System.out.println("Diga el exponente");
        int exponente=sc.nextInt();
        int total=base;
        for(int i=1;i<exponente;i++){
            total=total*base;
        }
        System.out.print("La potencia es "+total);
        sc.close();
	}
}