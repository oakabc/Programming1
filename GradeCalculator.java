/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author chanakarnkin
 */
public class GradeCalculator {
    
    public static void main(String[] args) {
        
        // Input
        Scanner input = new Scanner (System.in);
        System.out.print("Enter score 1: ");
        double x1 = input.nextInt();
        System.out.print("Enter score 2: ");
        double x2 = input.nextInt();
        System.out.print("Enter score 3: ");
        double x3 = input.nextInt();
        System.out.print("Enter score 4: ");
        double x4 = input.nextInt();
        System.out.print("Enter score 5: ");
        double x5 = input.nextInt();
        
        // Process
        double average; // ค่าเฉลี่ย
        
        average = (x1+x2+x3+x4+x5)/5; // 77.0
       
        System.out.println("The student's average grade is " + average);
        
        if (average >= 90 ) System.out.println("The student's letter grade is A");
        else if (average >=80) System.out.println("The student's letter grade is B");
        else if (average >= 70) System.out.println("The student's letter grade is C");
        else if (average >= 60) System.out.println("The student's letter grade is D");
        else System.out.println("The student's letter grade is F");
        
    }
    
}
