//haz un avion del que te den la anchura y la altura sea la mitad de esta

import java.util.Scanner;
public class avion{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Diga la anchura del avion:");
        int ancho=sc.nextInt();
        int altura=ancho/2+1;
        System.out.println("Donde quiere que empiece las ventanas");
        int eleccion1=sc.nextInt();
        System.out.println("Donde quiere que acaben las ventanas");
        int eleccion2=sc.nextInt();

        for(int i=1;i<=altura/2;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<=altura/2;i++){

            for(int j=1;j<=ancho;j++){
                if(i!=1 && i!=altura/2){
                    if(j>=eleccion1 && j<=eleccion2){
                        System.out.print("  ");
                    }else{
                        System.out.print("* ");
                    }
                }else{
                    System.out.print("* ");
                }
                if(j>=ancho*3/4){
                    for(int k=1;k<=i;k++){
                        System.out.print("* *");
                    }
                    break;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}