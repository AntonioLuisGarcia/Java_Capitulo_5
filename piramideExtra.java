
import java.util.Scanner;
public class piramideExtra{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Diga la altura");
        int altura = sc.nextInt();
        String nombre;
        int decision;
        int espacios_izquierda=0;
        boolean salir=false;
        int aumento=0;

        System.out.print("que caracter quieres para la piramide ");
        nombre=sc.next();
      
        for(int i=1;i<=altura;i++){

            for(int j=altura;j>=i;j--){
                System.out.print(" ");
            }

            for(int j=1;j<=i*2-1;j++){
                System.out.print(nombre);
            }
            System.out.println();
        }

        
        do{
            System.out.println("1. espacio izquierda");
            System.out.println("2. espacio derecha");
            System.out.println("3. agrandar");
            System.out.println("4. achicar");
            System.out.println("5. acabar");
            decision=sc.nextInt();

            switch(decision){
                case 1:

                    espacios_izquierda++;

                    for(int i=1;i<=altura+aumento;i++){

                        for(int j=1;j<=espacios_izquierda;j++){
                            System.out.print(" ");
                        }
                        
                        for(int j=altura+aumento;j>=i;j--){
                            System.out.print(" ");
                        }
            
                        for(int j=1;j<=i*2-1;j++){
                            System.out.print(nombre);
                        }
                        System.out.println();
                    }

                break;

                case 2:
                
                    if(espacios_izquierda>=1){
                        espacios_izquierda--;
                    
                        for(int i=1;i<=altura+aumento;i++){

                            for(int j=1;j<=espacios_izquierda;j++){
                                System.out.print(" ");
                            }
                            
                            for(int j=altura+aumento;j>=i;j--){
                                System.out.print(" ");
                            }
                
                            for(int j=1;j<=i*2-1;j++){
                                System.out.print(nombre);
                            }
                            System.out.println();
                        }

                    }else{
                        System.out.println("no se puede mover mas a la izquierda");
                    }

                break;

                case 3:

                    aumento++;    

                    for(int i=1;i<=altura+aumento;i++){

                        for(int j=1;j<=espacios_izquierda;j++){
                            System.out.print(" ");
                        }
                        
                        for(int j=altura+aumento;j>=i;j--){
                            System.out.print(" ");
                        }
            
                        for(int j=1;j<=i*2-1;j++){
                            System.out.print(nombre);
                        }
                        System.out.println();
                    }


                break;

                case 4:

                    aumento--;    

                    for(int i=1;i<=altura+aumento;i++){

                        for(int j=1;j<=espacios_izquierda;j++){
                            System.out.print(" ");
                        }
                        
                        for(int j=altura+aumento;j>=i;j--){
                            System.out.print(" ");
                        }
            
                        for(int j=1;j<=i*2-1;j++){
                            System.out.print(nombre);
                        }
                        System.out.println();
                    }

                break;

                case 5:
                    salir=true;
                break;

            }
        }while(!salir);

        sc.close();
        }
	}