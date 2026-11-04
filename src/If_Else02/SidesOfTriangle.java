package If_Else02;

import java.util.Scanner;

public class SidesOfTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st slide:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd slide:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd slide:");
        int c = sc.nextInt();
        if (a+b>c && b+c>a && c+a>b)
            System.out.println("Valid Triangle");
        else System.out.println("Invalid Triangle");
    }
}
