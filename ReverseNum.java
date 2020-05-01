class ReverseNum {
    public static void main(String [] args) {
        int num = 12321;
        int rev = 0;
        
        System.out.println("Number = " + num);
        
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reversed = " + rev);
    }
}