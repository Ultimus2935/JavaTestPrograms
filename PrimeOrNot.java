import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String [] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);

            long num = sc.nextLong();
            boolean flag = false;
            for(int i = 2; i <= num/2; ++i)
            {
                // condition for nonprime number
                if(num % i == 0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(num + " is a prime number.");

            else
                System.out.println(num + " is not a prime number.");

            sc.close();
        }
    }
}