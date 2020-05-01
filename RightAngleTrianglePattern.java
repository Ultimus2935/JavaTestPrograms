public class RightAngleTrianglePattern
{
    public static void main (String [] args) {
        char sym = '*';
        int line = 6;
        for(int i = 1;i <= line;i++) {
            for (int j = 1;j <= i;j++)
                System.out.print(sym + " ");
            System.out.println();
        } 
    }
}
