import java.util.Scanner;
public class eje15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te permite hacer varias potencias");
        System.out.println("Diga la base");
        int base=sc.nextInt();
        System.out.println("Diga el exponente al que se quiere llegar");
        int exponente=sc.nextInt();
        int total=base;
        System.out.print(base+", ");
        for(int i=1;i<exponente;i++){
            total=total*base;
            System.out.print(total+", ");
        }
        sc.close();
	}
}