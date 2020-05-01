public class CalcPI3 {
    public static void main(String [] args) {
        double PI = 0;
        double num = 1;

        System.out.println("Calculating the Value of PI........... " + Math.PI);
        
        for (int a = 1;a > 0;a += 2) {
            PI += num/a;
            num = -num;
            
            if (PI * 4 == Math.PI) {
                System.out.println("The Value of PI = " + PI * 4);
                System.out.println("The Number of Iterations Required = " + a);
                break;
            }
        }
    }
}