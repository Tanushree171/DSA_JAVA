package Loops03;

import java.util.Scanner;

public class CountsDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0) n=1;
        int count =0;
        while (n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
