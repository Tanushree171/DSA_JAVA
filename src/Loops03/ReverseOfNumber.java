package Loops03;

import java.util.Scanner;

public class ReverseOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int r =0;
    while(n!=10){
        r *=10;
        r+=(n%10);
        n/=10;
    }
        System.out.println(r);
    }
}
