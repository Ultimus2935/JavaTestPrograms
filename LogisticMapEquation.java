public class LogisticMapEquation
{
    public static void main (String [] args) {
        double x = 0.734534445646934;
        double r = 5.8465568568467;
        
        double prev = x;

        for (int i = 1;i <= 100;i++) {
            System.out.print((double)(x) + "\t");
            System.out.println((double)(x - prev));
            x = r * x * (1 - x);
        }
    }
}
