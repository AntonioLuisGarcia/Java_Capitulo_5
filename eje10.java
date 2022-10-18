import java.util.Scanner;
public class eje10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa sirve para calcular la media de n numeros al introducir un numero negativo se detendra el programa");
        double total=0;
        double i=0;
        boolean salir = true;
        while (salir) {
            float numero=sc.nextFloat();
            if(numero<0){
                salir=false;
                break;
            }
            total=total+numero;
            i++;
        }
        System.out.print("La media es "+total/i);
        sc.close();
	}
}