package Loops03;

import java.util.Scanner;

public class PowerLoop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pow = 1;
        for (int i=1;i<=b; i++){
            pow *=a;
        }
        System.out.println(pow); // System.out.println(a+ "raise to the power "+b+ "is" +pow);
    }
}
