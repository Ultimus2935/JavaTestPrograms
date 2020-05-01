import java.util.Scanner;

public class CharToInt
{
    public static void main(String [] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            char ch = sc.next().charAt(0);
            int num = (int) ch;
            
            System.out.print(num);
            System.out.println();

            sc.close();
        }
    }
}
