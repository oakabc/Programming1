
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkin
 */
public class LabExam {
    
    public static void main(String[] args) { //psvm + tab
        
        // Input
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter P:"); // sout + tab
        int P = input.nextInt();
        System.out.print("Enter R:"); // sout + tab
        int R = input.nextInt();
        System.out.print("Enter T:"); // sout + tab
        int T = input.nextInt();
        
        // Process คิดค่า SI จากนั้นคิดค่า A
        double SI;
        
        SI = ( P * R * T ) / 100.0;
        
        System.out.println("SI = " + Math.round(SI));
        
        double A;
        
        A = P + SI;
        
        System.out.println("A = " + (int)A);
    }
    
}
