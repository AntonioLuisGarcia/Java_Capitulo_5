import java.util.Scanner;
public class cuadradoPiramide{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Especifique el lado del cuadrado");
        int lado=sc.nextInt();

        System.out.println("diga la altura de la piramide");
        int alturaPiramide=sc.nextInt();

        int diferenciaPiramideCuadrado=lado-(alturaPiramide*2-1);

        int aumento=1;



        for(int i=1;i<=lado;i++){
            System.out.print("*");
        }

        System.out.println();
        
        for(int i=1;i<=lado-2;i++){
            System.out.print("*");

            for(int j=1;j<=diferenciaPiramideCuadrado;j++){
                System.out.print(" ");
            }

            for(int j=alturaPiramide;j>aumento;j--){
                System.out.print(" ");
            }
            

            for(int j=1;j<=aumento*2-1;j++){
                System.out.print("*");
            }


            //falta controlar que solo lo haga cuadno llegue a la altuar piramide y ponerla en  mitad
            aumento++;

            for(int j=1;j<=diferenciaPiramideCuadrado;j++){
                System.out.print(" ");
            }

            for(int j=alturaPiramide;j>1;j--){
                System.out.print(" ");
            }

            System.out.println("*");
        }
        
        for(int i=1;i<=lado;i++){
            System.out.print("*");
        }

        sc.close();
        }
	}
