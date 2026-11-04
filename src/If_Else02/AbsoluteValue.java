package If_Else02;

import java.util.Scanner;

public class AbsoluteValue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n >=0) System.out.println(n);
        else System.out.println(-n);
    }
}
