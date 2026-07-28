import java.util.Scanner;

public class Incometax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter annual salary in lakh");
        int salary =sc.nextInt();
        if (salary<=500000) {
            System.out.println("No tax");
            
        }
        else if (salary>500000 && salary<=1000000) {
            salary = ((20*salary)/100);
            System.out.println("Tax = "+salary);        
    }
else {
    salary = ((30*salary)/100);
        System.out.println("Tax = "+salary); 
}
}
}
