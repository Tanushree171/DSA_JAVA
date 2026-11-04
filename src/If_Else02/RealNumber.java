package If_Else02;

import java.util.Scanner;

public class RealNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = sc.nextDouble(); //n=3.14
        int x = (int)n; //typecasting so here it becomes x=3
        if (n-x > 0) System.out.println("Not an integer");
        else System.out.println("Is an Integer");
    }
}
