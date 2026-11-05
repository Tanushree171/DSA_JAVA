package Loops03;

import java.util.Scanner;

public class GeometricProgress {
    static void main() {
        // Display this GP -1,2,4,8...upto n terms
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a =1, r=2;
        for (int i=1;i<=n;i++){
            System.out.print(a+ " ");
            a*=r;}
        }
    }

