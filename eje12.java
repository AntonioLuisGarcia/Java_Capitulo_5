import java.util.Scanner;
public class eje12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("¿cuantos numeros de la sucesion aurea quieres?");
        int n = sc.nextInt();
        int fibo1= 0;
        int fibo2= 1;
        int fibo3=0;
        System.out.print("0");
        for(int i= 1;i<=n;i++){
            fibo3=fibo2;
            System.out.print(fibo2+",");
            fibo2=fibo2+fibo1;
            fibo1=fibo3;
        }
		sc.close();
	}
}