import java.util.Scanner;
public class eje13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime 10 numeros y te dire cuantos son positivos y cuantos negativos");
        int npositivos=0;
        int nnegativos=0;
        for(int i=1;i<=10;i++){
            int numero=sc.nextInt();
            if(numero>=0){
                npositivos++;
            }else{
                nnegativos++;
            }
        }
        System.out.print(npositivos+" son positivos y "+nnegativos+" son negativos");
        sc.close();
	}
}