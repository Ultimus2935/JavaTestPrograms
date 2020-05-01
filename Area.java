public class Area {
    public static void area (int s) {
        //Area of Square
        System.out.println(s * s);
    }
    
    public static void area (int l, int b) {
        //Area of Rectangle
        System.out.println(l * b); 
    }
    
    public static void area (int a, int b, int c) {
        //Area of Triangle
        double s = (a+b+c)/2;
        s = s*(s-a)*(s-b)*(s-c);
        System.out.println(Math.sqrt(s));
    }
    
    public static void main (String [] args) {
        area(14, 56);
    }
}