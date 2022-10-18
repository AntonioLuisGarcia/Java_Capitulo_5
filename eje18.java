import java.util.Scanner;
public class eje18{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Diga el primer numero");
        int numero1=sc.nextInt();
        System.out.println("Diga el segundo numero");
        int numero2=sc.nextInt();
        int total=numero1;
        while(total<numero2-7){
            total=total+7;
            System.out.print(total+", ");
        }        
        sc.close();
	}
}