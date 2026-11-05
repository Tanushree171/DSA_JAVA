package Loops03;

import java.util.Scanner;

public class GPQuestion {
    //Take n as input from user and print the following sequence
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for( int i=1; i<=n; i++){
            System.out.println(i);
            System.out.println(n-i+1);
        }
    }
}
