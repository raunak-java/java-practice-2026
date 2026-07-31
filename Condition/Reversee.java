import java.util.Scanner;

public class Reversee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int D,rev=0;
        while (num>0) {
         D = num%10;  //Take last digits
         rev = rev*10+D;  //Store last digits
         num = num/10;  //Remove last digits
            
            
        }
        System.out.println("Reverse of number is :"+rev);
    }
}

