import java.util.Scanner;

public class SimpleInterest
{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("principle amount: ");
        int p = sc.nextInt();
        System.out.print("rate: ");
        int r = sc.nextInt();
        System.out.print("time: ");
        int t = sc.nextInt();
        System.out.println((p * r * t) / 2); 

        sc.close();
    }
}