package Loops03;

import java.util.Scanner;

public class FactorialOfNumber {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        for (int i =1; i<=n; i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
