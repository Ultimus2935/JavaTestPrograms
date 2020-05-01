import java.util.Scanner;

public class CalcPI2 {
    
    static Scanner myInput = new Scanner(System.in);
    
    public static void main(String [] args) {
        
        int myCounter = 1;
        double myPi = 4.0;
        double myFooter = 3.0;
        
        System.out.println("How many times do you want to calculate to PI ? ");
        int numberOfTimes = myInput.nextInt();
        
        while (numberOfTimes >= myCounter) {
            /*Here we are going to calculate PI.
             * PI = 4 - 4/3 + 4/5 - 4/7 + 4/9....
             */
            myPi = myPi - (4/myFooter) + (4/(myFooter+2));
            System.out.println(myPi);
            myCounter++;
            myFooter+=4;
        }
        
        double newPi = myPi;
        double newFooter = myFooter;
        
        System.out.println("The last value was: " + newPi);
        
        System.out.print("Do you want to continue calculating ? Y/N ? ");
        String contCalcul = myInput.next();
        
        if (contCalcul.equalsIgnoreCase("y")) {
            System.out.println("How many times ? ");
            int newCounter = 1;
            int newCalcul = myInput.nextInt();
            
            while (newCalcul >= newCounter) {
                newPi = newPi - (4/newFooter) + (4/(newFooter+2));
                System.out.println(newPi);;
                newCounter+=1;
            }
        } 
        
        else {
            System.out.println("The real value of Pi is: " +Math.PI);
            System.out.println("Goodbye");
        }
    }
}