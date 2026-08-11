import java.util.Scanner;

public class Prime {
   static boolean prime(int n){
   boolean prime=true;
    for(int i=2;i<n;i++){
        if (n%i==0){
            prime=false;
        }
    }
    return(prime);
   } 
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    
    boolean reuslt =prime(n);
    if(reuslt==true){
        System.out.println(n+" is a prime number");

    }
    else{
        System.out.println(n+" is not a prime number");
    }
   }
}
