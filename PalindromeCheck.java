import java.util.Scanner;

class PalindromeCheck {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int rev = 0;
        
        int check = num;
        
        System.out.println("Number = " + check);
        
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reverse = " + rev);
        
        if (check == rev) 
            System.out.println("Yes, it is a Palindrome number.");
            
        else 
            System.out.println("No, it is not a Palindrome number.");

        sc.close();
    }
}
