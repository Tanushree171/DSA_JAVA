package If_Else02;

import java.util.Scanner;

public class PositiveInteger {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int n= sc.nextInt();
        if (n%5 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
