import java.util.Scanner;

public class CalcPI1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        double PI = 0;
        double num = 1;
        
        System.out.print("Enter Precesion Value:");
        long precision = sc.nextLong();
        System.out.println("Calculating the Value of PI with the given Precision.");
        
        for (int a = 1;a < precision;a += 2) {
            PI += num/a;
            num = -num;
        }

        System.out.println("The Value of PI = " + PI * 4);
        
        sc.close();
    }
}