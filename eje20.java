import java.util.Scanner;
public class eje20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("De que altura quieres la piramide");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura-1; i++) {
            for (int j = i; j <altura ; j++){
                System.out.print(" "); 
            }
            if(i!=1){
            System.out.print("*");
            }
            for (int k = 1; k < (i-1)*2 ; k++){
                System.out.print(" "); 
            }
            System.out.print("*");
            System.out.println("");
        }
        for(int i=1;i<=altura*2-1;i++){
            System.out.print("*");
        }
        sc.close();
    }
}