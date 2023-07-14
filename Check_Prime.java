import java.util.Scanner;

public class Check_Prime {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            
            int div = 2;
            while(div <= n/2){
                if(n % div == 0){
                    System.out.println("not prime");
                    return;
                }
                div = div + 1;
            }
            System.out.println("prime number");
        }
    }
    
}
