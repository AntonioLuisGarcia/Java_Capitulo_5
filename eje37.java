// Realiza un conversor del sistema decimal al sistema de “palotes”.

import java.util.Scanner;
public class eje37{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa convertira el numero introducido en palotes");
        System.out.println("Introduzca el numero");
        int numero= sc.nextInt();
		int volteado=0;
		int cont=0;
		while(numero>=1){
			volteado=(volteado*10)+numero%10;
			numero /=10;
            cont++;
		}
        for(int i=0;i<=cont;i++){

            for(int j=1;j<=volteado%10;j++){
                System.out.print("|");
            }
            System.out.print("-");
            volteado /=10;
        }
		   
		sc.close();
	}
}