import java.util.Scanner;

public class Power
{
    public static void main (String [] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            int pow = sc.nextInt();

            System.out.println(Math.pow(num,pow) + "\n");

            sc.close();
        }
    }
}