import java.util.Scanner;

public class While{
    public static void main(String[] args) {
        int c=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int n = sc.nextInt();
        while(c<=n){
            System.out.print(c);
            System.out.print(" ");
            c++;
        }
    }
}
