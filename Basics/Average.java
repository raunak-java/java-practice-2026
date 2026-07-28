import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int average=(A+B+C)/3;
        System.out.println("Average of these numbers is =  "+average);

    }
}
