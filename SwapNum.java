public class SwapNum
{
    public static void main (String [] args) {
        int a = 69;
        int b = 42;
        System.out.println("a = "+ a +" b = " + b);
        a = a + b;
        System.out.println("\nSwapping..... \n");
        b = a - b;
        a = a - b;
        System.out.println("a = "+ a +" b = " + b);
    }
}