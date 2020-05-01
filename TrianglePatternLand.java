public class TrianglePatternLand
{
    public static void main (String [] args) {
        char sym = '*';
        int num = 1;
        
        int line = 5;
        
        //Upside-down Right Angle Triangle
        for(int i = 1;i <= line;i++) {
            for (int j = line;j >= i;j--)
                System.out.print(sym + " ");
            System.out.println();
        } 
        
        //Right Angle Triangle
        for(int i = 1;i <= line;i++) {
            for (int j = 1;j <= i;j++)
                System.out.print(sym + " ");
            System.out.println();
        } 
        
        //Floyd's Triangle
        for(int i = 1;i <= line;i++) {
            for (int j = 1;j <= i;j++,num++)
                System.out.print(num + " ");
            System.out.println();
        } 
        
        //Pascal's Triangle
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