public class UpsideDownRightAngleTrianglePattern
{
    public static void main (String [] args) {
        char sym = '*';
        int line = 7;
        for(int i = 1;i <= line;i++) {
            for (int j = line;j >= i;j--)
                System.out.print(sym + " ");
            System.out.println();
        } 
    }
}
