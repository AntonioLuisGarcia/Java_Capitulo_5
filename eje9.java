import java.util.Scanner;
public class eje9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero y te dire cuantas cifras tiene");
        long numero=sc.nextLong();
        int cifras=0;
        int i=1;
        while (i<=numero) {
            i=i*10;
            cifras++;
        }
        System.out.print("Tiene "+cifras+" cifras");
        sc.close();
	}
}