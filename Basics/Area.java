import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        Float r=sc.nextFloat();
        Float area = 3.14f*r*r;
        System.out.println("Area of a circle is : "+area);
        

    }
}

