import java.util.Scanner;

public class G2 {
    public static void main(String args[]) {
    
        // Input 
        Scanner input = new Scanner (System.in);
        
        System.out.print("โปรดใส่ค่า P: ");
        int P = input.nextInt();
        System.out.print("โปรดใส่ค่า r: ");
        double r = input.nextInt(); 
        r = r / 100;
        System.out.println("r = " + r);
        System.out.print("โปรดใส่ค่า t: ");
        int t = input.nextInt(); 
        int n = 1;
        
        // Process แทนค่าในสมการเพื่อหา A
        double A; // เพื่อเก็บคำตอบของสมการ
        
        A = P * Math.pow(1 + r/n , n*t);
        
        // Output
        System.out.println("ค่า A เมื่อกำหนด t = "+t+" คือ: "+A);
        
    }
}