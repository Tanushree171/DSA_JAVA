package Loops03;

import java.util.Scanner;

public class ArithmeticProgress {
    static void main() {
        // display AP from 2,5,8,11...upto n terms
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=2; i<=3*n-1; i+=3){ // an =a+(n-1)d // i+=3 means i=i+3
            System.out.print(i+ " ");    // 2+(n-1)3. So, 2+3n-3 it will give 3n-1
        }
    }
} // method 1: using i when the condition is known
// method 2: using a when number of terms are known
// another method: int a =2 , d=3;
// for inti =1;i<=n;i++){
// System.out.print(a+" ");
// a+=d;}