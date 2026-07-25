import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        Float a=sc.nextFloat();
        Float b=sc.nextFloat();
        Float P=a*b;
        System.out.println("Product of two number is: "+P);
    }
}
