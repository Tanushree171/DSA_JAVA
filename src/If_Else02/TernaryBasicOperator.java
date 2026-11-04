package If_Else02;

import java.util.Scanner;

public class TernaryBasicOperator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
       // if (n%2==0) System.out.println("Even");
        //else System.out.println("Odd");
    //Ternary operator: Condition ? truth : lie
        System.out.println(n%2==0 ? "Even":"Odd");
    }
}
