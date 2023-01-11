import java.util.Scanner;

public  class conttraseñaAleatoria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String password="";

        System.out.println("De cuantos caracteres quieres la contraseña");
        int longitud = sc.nextInt();
        for (int i=0;i<longitud;i++){

            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
            int eleccion=((int)Math.floor(Math.random()*3+1));

            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                password+=mayusculas;
            }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }

            }
        }

        System.out.println(password);

        System.out.println("¿Quieres saber si tu contraseña es segura?\n1.Si\n2.No");

        int eleccion = sc.nextInt();
        
        if(eleccion == 1 ){
            int cuentanumeros=0;
            int cuentaminusculas=0;
            int cuentamayusculas=0;

            //Vamos caracter a caracter y comprobamos que tipo de caracter es

            for (int i=0;i<password.length();i++){

                if (password.charAt(i)>=97 && password.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (password.charAt(i)>=65 && password.charAt(i)<=90){
                    cuentamayusculas+=1;
                    }else{
                        cuentanumeros+=1;
                    }
                }
            }
                //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
                if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
                    System.out.println("Es segura");
                }else{
                    System.out.println("No es segura");;
            }
        }

        sc.close();
    }
    

}
