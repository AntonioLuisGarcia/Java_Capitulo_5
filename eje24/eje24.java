import java.util.Scanner;
public class eje24{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("¿De que altura quieres la piramide de numeros?");
        int altura = sc.nextInt();
        int n=1;

        for(int i=1 ; i<=altura ; i++){

            for(int j=i ; j<altura ; j++){
                System.out.print(" ");
            }
            n=1;
            for(int k=1 ; k<i*2 ; k++){
                if(k<=i){
                System.out.print(k);
                }else{
                    System.out.print(k-n*2);
                    n++;
                }
            }
            System.out.println("");
        }

		sc.close();

	}
}