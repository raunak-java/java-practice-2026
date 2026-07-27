import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Person is adult.");

        }
        else if (age>=13 && age<18) {
            System.out.println("Person is teenager.");
            
        }
        else{
            System.out.println("Person is not adult not a teenager");
        }
    }
}
