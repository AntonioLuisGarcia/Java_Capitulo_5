
import java.util.Scanner;
public class ejeExtra{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
        String nombre=" ";

        nombre=sc.nextLine();

        int longitud= nombre.length();
        int espacios=(40-longitud)/2;

     
            System.out.printf("%"+espacios+"s",nombre);

        sc.close();
        }
	}
