package If_Else02;

import java.util.Scanner;

public class OddEven {
    static void main() {
        Scanner sc= new Scanner(System.in); // scanner is used to take user input
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n%2 == 0) System.out.println("Even Number");
        else System.out.println("Odd Number");
    }
}
