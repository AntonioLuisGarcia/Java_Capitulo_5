public class eje22 {
    public static void main(String[] args){
        System.out.println("Este programa muestra todos los numeros primos desde 2 a 100");
        boolean primo; 
        for(int i=2;i<100;i++){
            primo=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    primo=false;
                }
            }
            if(primo){
                System.out.print(i+",");
            }
        }
	}
}