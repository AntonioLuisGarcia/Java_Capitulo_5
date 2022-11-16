import java.util.Scanner;
public class repaso{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
        int height=sc.nextInt();

        for(int i=1;i<=height*2+1;i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i=1 ; i<=height ; i++){
            
            for(int j=0;j<=height-i;j++){

                if(j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("*");
            }

            for(int j=height-i;j>=0;j--){

                if(j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();

    }
    sc.close();

	}
}
