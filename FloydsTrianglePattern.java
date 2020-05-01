public class FloydsTrianglePattern
{
    public static void main (String [] args) {
        int k = 1;
        int line = 4;
        for(int i = 1;i <= line;i++) {
            for (int j = 1;j <= i;j++,k++)
                System.out.print(k + " ");
            System.out.println();
        } 
    }
}