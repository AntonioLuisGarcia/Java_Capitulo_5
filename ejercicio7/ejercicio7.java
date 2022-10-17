import java.util.Scanner;
public class ejercicio7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int contraseña= 1234;
        System.out.print("Intenta desbloquear mi caja fuerte, tienes 4 intentos y tienes que usar un numero de 4 cifras");

        for(int i=4;i>0;i--){

            int intento= sc.nextInt();
            if(intento<999 || intento>10000){
            System.out.println("la contraseña tiene que tener 4 digitos");
            }

            if(intento != contraseña){
                System.out.println("Vuelve a intentarlo");
                System.out.println("Te quedan "+ (i-1) +" intentos");
            }else{
                System.out.println("Lo has conseguido!!!!!");
                System.out.print("La has abierto!!!");
            }
        }
		sc.close();
	}
}