package Loops03;

import java.util.Scanner;

public class SumOfDigits {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        while (n!=0){
        sum +=(n%10);
        n/=10;
    }
        System.out.println(sum);}
}
// for minus number we can use ternary operator which is
// System.out.println((sum>0) ? sum: -sum);
