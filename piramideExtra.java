
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
        int contador5=0;
        int contador6=7;


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
            System.out.println("1. espacio derecha");
            System.out.println("2. espacio izquierda");
            System.out.println("3. agrandar");
            System.out.println("4. achicar");
            System.out.println("5. ponerla hueca");
            System.out.println("6. poner huecos,tiene que ser la altura impar");
            System.out.println("7. acabar");
            decision=sc.nextInt();

            switch(decision){
                case 1:

                    espacios_izquierda++;

                    if(contador5==0){
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
                    }
                    
                    if(contador5==1){

                        for(int i=1;i<=altura+aumento;i++){

                            for(int j=1;j<=espacios_izquierda;j++){
                                System.out.print(" ");
                            }
                            
                            for(int j=altura+aumento;j>=i;j--){
                                System.out.print(" ");
                            }
                
                            System.out.print(nombre);

                            if(i!=altura+aumento){

                                for(int j=1;j<=i*2-3;j++){

                                    System.out.print(" ");

                                }

                            }else{

                                for(int j=1;j<=i*2-3;j++){

                                    System.out.print(nombre);

                                } 
                            }

                            if(i!=1){
                                System.out.print(nombre);
                            }
                            System.out.println();

                        }
                    }

                    if(contador6==0 && contador5==0){
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
                    }

                    if(contador6==1){

                        if((altura+aumento)%2==0){
                            System.out.println("agrande o achica la piramide para que sea impar");
                        }else{
    
                            for(int i=1;i<=altura+aumento;i++){
    
                                for(int j=1;j<=espacios_izquierda;j++){
                                    System.out.print(" ");
                                }
                                
                                for(int j=altura+aumento;j>=i;j--){
                                    System.out.print(" ");
                                }
                    
                                System.out.print(nombre);
    
                                if(i%2==0){
    
                                    for(int j=1;j<=i*2-3;j++){
    
                                        System.out.print(" ");
    
                                    }
    
                                }else{
    
                                    for(int j=1;j<=i*2-3;j++){
    
                                        System.out.print(nombre);
    
                                    } 
                                }
    
                                if(i!=1){
                                    System.out.print(nombre);
                                }
                                System.out.println();
                            }
    
                        }

                    }

                break;

                case 2:
                
                    if(espacios_izquierda>=1){

                        espacios_izquierda--;
                    
                        if(contador5==0){
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
                        }
                        
                        if(contador5==1){
    
                            for(int i=1;i<=altura+aumento;i++){
    
                                for(int j=1;j<=espacios_izquierda;j++){
                                    System.out.print(" ");
                                }
                                
                                for(int j=altura+aumento;j>=i;j--){
                                    System.out.print(" ");
                                }
                    
                                System.out.print(nombre);
    
                                if(i!=altura+aumento){
    
                                    for(int j=1;j<=i*2-3;j++){
    
                                        System.out.print(" ");
    
                                    }
    
                                }else{
    
                                    for(int j=1;j<=i*2-3;j++){
    
                                        System.out.print(nombre);
    
                                    } 
                                }
    
                                if(i!=1){
                                    System.out.print(nombre);
                                }
                                System.out.println();
    
                            }
                        }
    
                        if(contador6==0  && contador5==0){
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
                        }
    
                        if(contador6==1){
    
                            if((altura+aumento)%2==0){
                                System.out.println("agrande o achica la piramide para que sea impar");
                            }else{
        
                                for(int i=1;i<=altura+aumento;i++){
        
                                    for(int j=1;j<=espacios_izquierda;j++){
                                        System.out.print(" ");
                                    }
                                    
                                    for(int j=altura+aumento;j>=i;j--){
                                        System.out.print(" ");
                                    }
                        
                                    System.out.print(nombre);
        
                                    if(i%2==0){
        
                                        for(int j=1;j<=i*2-3;j++){
        
                                            System.out.print(" ");
        
                                        }
        
                                    }else{
        
                                        for(int j=1;j<=i*2-3;j++){
        
                                            System.out.print(nombre);
        
                                        } 
                                    }
        
                                    if(i!=1){
                                        System.out.print(nombre);
                                    }
                                    System.out.println();
                                }
        
                            }
    
                        }    

                    }else{
                        System.out.println("no se puede mover mas a la izquierda");
                    }

                break;

                case 3:

                    aumento++;    

                    if(contador5==0){
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
                    }
                    
                    if(contador5==1){

                        for(int i=1;i<=altura+aumento;i++){

                            for(int j=1;j<=espacios_izquierda;j++){
                                System.out.print(" ");
                            }
                            
                            for(int j=altura+aumento;j>=i;j--){
                                System.out.print(" ");
                            }
                
                            System.out.print(nombre);

                            if(i!=altura+aumento){

                                for(int j=1;j<=i*2-3;j++){

                                    System.out.print(" ");

                                }

                            }else{

                                for(int j=1;j<=i*2-3;j++){

                                    System.out.print(nombre);

                                } 
                            }

                            if(i!=1){
                                System.out.print(nombre);
                            }
                            System.out.println();

                        }
                    }

                    if(contador6==0 && contador5==0){
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
                    }

                    if(contador6==1){

                        if((altura+aumento)%2==0){
                            System.out.println("agrande o achica la piramide para que sea impar");
                        }else{
    
                            for(int i=1;i<=altura+aumento;i++){
    
                                for(int j=1;j<=espacios_izquierda;j++){
                                    System.out.print(" ");
                                }
                                
                                for(int j=altura+aumento;j>=i;j--){
                                    System.out.print(" ");
                                }
                    
                                System.out.print(nombre);
    
                                if(i%2==0){
    
                                    for(int j=1;j<=i*2-3;j++){
    
                                        System.out.print(" ");
    
                                    }
    
                                }else{
    
                                    for(int j=1;j<=i*2-3;j++){
    
                                        System.out.print(nombre);
    
                                    } 
                                }
    
                                if(i!=1){
                                    System.out.print(nombre);
                                }
                                System.out.println();
                            }
    
                        }

                    }

                break;

                case 4:

                    aumento--;    

                    if(altura+aumento>=1){ 


                       if(contador5==0){
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
                    }
                    
                        if(contador5==1){

                            for(int i=1;i<=altura+aumento;i++){

                                for(int j=1;j<=espacios_izquierda;j++){
                                    System.out.print(" ");
                                }
                                
                                for(int j=altura+aumento;j>=i;j--){
                                    System.out.print(" ");
                                }
                    
                                System.out.print(nombre);

                                if(i!=altura+aumento){

                                    for(int j=1;j<=i*2-3;j++){

                                        System.out.print(" ");

                                    }

                                }else{

                                    for(int j=1;j<=i*2-3;j++){

                                        System.out.print(nombre);

                                    } 
                                }

                                if(i!=1){
                                    System.out.print(nombre);
                                }
                                System.out.println();

                            }
                        }

                        if(contador6==0 && contador5==0){
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
                        }

                        if(contador6==1){

                            if((altura+aumento)%2==0){
                                System.out.println("agrande o achica la piramide para que sea impar");
                            }else{
        
                                for(int i=1;i<=altura+aumento;i++){
        
                                    for(int j=1;j<=espacios_izquierda;j++){
                                        System.out.print(" ");
                                    }
                                    
                                    for(int j=altura+aumento;j>=i;j--){
                                        System.out.print(" ");
                                    }
                        
                                    System.out.print(nombre);
        
                                    if(i%2==0){
        
                                        for(int j=1;j<=i*2-3;j++){
        
                                            System.out.print(" ");
        
                                        }
        
                                    }else{
        
                                        for(int j=1;j<=i*2-3;j++){
        
                                            System.out.print(nombre);
        
                                        } 
                                    }
        
                                    if(i!=1){
                                        System.out.print(nombre);
                                    }
                                    System.out.println();
                                }
        
                            }

                        }

                    }else{
                        System.out.println("Has hecho tan pequeña la piramide que ha desaparecido");
                    }


                break;

                case 5:

                    contador5=1;
                    contador6=0;
                    
                        for(int i=1;i<=altura+aumento;i++){

                            for(int j=1;j<=espacios_izquierda;j++){
                                System.out.print(" ");
                            }
                            
                            for(int j=altura+aumento;j>=i;j--){
                                System.out.print(" ");
                            }
                
                            System.out.print(nombre);

                            if(i!=altura+aumento){

                                for(int j=1;j<=i*2-3;j++){

                                    System.out.print(" ");

                                }

                            }else{

                                for(int j=1;j<=i*2-3;j++){

                                    System.out.print(nombre);

                                } 
                            }

                            if(i!=1){
                                System.out.print(nombre);
                            }
                            System.out.println();
                        }

                break;

                case 6:

                    contador6=1;
                    contador5=0;

                    if((altura+aumento)%2==0){
                        System.out.println("agrande o achica la piramide para que sea impar");
                    }else{

                        for(int i=1;i<=altura+aumento;i++){

                            for(int j=1;j<=espacios_izquierda;j++){
                                System.out.print(" ");
                            }
                            
                            for(int j=altura+aumento;j>=i;j--){
                                System.out.print(" ");
                            }
                
                            System.out.print(nombre);

                            if(i%2==0){

                                for(int j=1;j<=i*2-3;j++){

                                    System.out.print(" ");

                                }

                            }else{

                                for(int j=1;j<=i*2-3;j++){

                                    System.out.print(nombre);

                                } 
                            }

                            if(i!=1){
                                System.out.print(nombre);
                            }
                            System.out.println();
                        }

                    }

                break;

                case 7:
                    salir=true;
                    System.out.println("Has salido");
                break;

            }
        }while(!salir);

        sc.close();
        }
	}