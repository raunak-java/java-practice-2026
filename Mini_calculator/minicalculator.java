import java.util.Scanner;

public class minicalculator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Choose operations:");
        System.out.println("1.Addition:");
         System.out.println("2.Substraction:");
          System.out.println("3.Multiplication:");
           System.out.println("4.Divison:");
            System.out.println("5.Mod:");
        
        int choise=sc.nextInt();
        switch (choise) {
            case 1:System.out.println(a+b);
                break;
            case 2:System.out.println(a-b);
                break;
            case 3:System.out.println(a*b);
                break;
        case 4:System.out.println(a/b);
                break;
            case 5:System.out.println(a%b);
                break;
            default:System.out.println("Choose valid options");
                break;
        }

    }
}
