package Loops03;

import java.util.Scanner;

public class BreakandContinue {
    // Composite Numbers
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
      boolean flag = true; // 0 denotes prime
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // 'i' is a factor of n
                flag = false; // 1 denotes composite
                break;
            }
        }
        if(n==1) System.out.println("Neither prime nor Composite");
       else if (flag == false) System.out.println("Composite number");
        else System.out.println("Prime number");
    }
}