import java.util.Scanner;

public class G3 {
    public static void main(String args[]) {
        
        // Input 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter P:");
        int P = input.nextInt();
        System.out.print("Enter i:");
        double i = input.nextInt();
        
        i = i/100/12;
        System.out.println("i = " + i);
        
        System.out.print("Enter n:");
        int n = input.nextInt();
        n = n * 12;
        // Process
        double M;
        
        M = (P * i * Math.pow(1 + i, n))/(Math.pow(1 + i, n) - 1);
  
        // Output
        System.out.println("M is "+Math.round(M)+" When P = " + P);
    }
}