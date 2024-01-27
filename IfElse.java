
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkin
 */
public class IfElse {
    
    public static void main(String[] args) {
        
        // Input 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        // Process + Output
        
        if (n > 0) {
            System.out.println("The number is positive.");
        }
        else if (n == 0) {
            System.out.println("The number is zero.");
        }
        else System.out.println("The number is negative.");
        
    }
    
}
