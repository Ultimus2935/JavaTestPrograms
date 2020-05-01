public class PascalTrianglePattern
{
    public static void main (String [] args) {
        int num = 1;
        int line = 5;
        for(int i = 0;i < line;i++) {
            for (int j = line;j > i;j--) {
                System.out.print(" ");
            }
            num = 1;
            for (int k = 0;k <= i;k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);
            }
            System.out.println();
        } 
    }
}
