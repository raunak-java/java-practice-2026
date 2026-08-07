import java.util.Scanner;

public class continueques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a new number:");
            int n = sc.nextInt();
            
            if (n%10==0){
                
                System.out.println("END");
                continue;

            }
            System.out.println(n);
        } while (true);
    }
}
