import java.util.Scanner;

public class IntToChar
{
    public static void main(String [] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            
            int num = sc.nextInt();
            char ch = (char) num;
            
            System.out.print(ch);
            System.out.println();

            sc.close();
        }
    }
}