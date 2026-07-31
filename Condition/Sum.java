import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int n = sc.nextInt();
        int c = 1;
        int sum = 0;
        while (c<=n) {
            sum+=c;
            c++;
            
        }
        System.out.println("Sum from 1 to "+n+" is "+sum);

    }
}
