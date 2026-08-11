import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;   
        }
     return(f);
    }
    public static int bincoff(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c= factorial(n-r);
       int bino = (a/(b*c));
        return(bino);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Factorial of n is:"+factorial(n));
        System.out.println("Factorial of r is:"+factorial(r));
        System.out.println("Binomial cofficient is:"+bincoff(n, r));
        
    }
}