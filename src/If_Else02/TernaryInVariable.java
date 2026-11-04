package If_Else02;

import java.util.Scanner;

public class TernaryInVariable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int taanu = (n>0) ? 100:0;
        System.out.println(taanu);
    }
}
