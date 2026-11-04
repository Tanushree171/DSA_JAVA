package If_Else02;

import java.util.Scanner;

public class UseOfOR {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0) System.out.println("Divisible be 5 or 3"); // when % will use we have to do ==0
        else System.out.println(" Not Divisible by 5 or 3");
    }
}
