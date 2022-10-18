import java.util.Scanner;
public class eje16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("¿Que numero quieres saber si es primo? ");
        int nprimo = sc.nextInt();
        boolean n =true;
        int i=1;
        while(i<nprimo-1 && n){
            i++;
            if(nprimo%i==0){
                n=false;
            }else{
                n=true;
            }
        }
        if(n){
            System.out.print(nprimo+" es primo");
        }else{
            System.out.print(nprimo+" no es primo");
        }
        sc.close();
        }
	}