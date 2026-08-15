import java.util.Scanner;

public class Primee {

    static boolean primee(int n) {
        if (n < 2) {
            return false;
        }

        boolean primee = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primee = false;
                break;
            }
        }

        return primee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range");
        int n = sc.nextInt();

        System.out.println("Prime numbers between 1 to " + n + " are:");

        for (int i = 1; i <= n; i++) {
            boolean result = primee(i);

            if (result == true) {
                System.out.println(i);
            }
        }
    }
}