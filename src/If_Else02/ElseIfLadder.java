package If_Else02;

import java.util.Scanner;

public class ElseIfLadder {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        if (a%3==0 && a%5==0) {
            System.out.println("Divisible by both");
        } else if (a%3==0) {
            System.out.println("Divisible by 3");
        } else if (a%5==0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible");
        }
    }
}
