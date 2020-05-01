import java.util.Scanner;

class Fibonacci {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long max = sc.nextInt();
        
        long num = 1, old = 0;
        
        while (num <= max){
            System.out.println(num);
            num += old;
            old = num;
        }

        sc.close();
    }
}