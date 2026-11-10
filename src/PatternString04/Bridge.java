package PatternString04;

import java.util.Scanner;

public class Bridge {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=2*n-1;i++){// first straight line
            System.out.print("* ");
        }
        System.out.println();
        int nsp=1;
        for (int i=1;i<=n-1;i++){ //lines
            for (int j=1;j<=n-i;j++){ //stars
                System.out.print("* ");
            }
            for (int j=1;j<=nsp;j++){ //spaces
                System.out.print("  ");
            }
            for (int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }
    }
}
