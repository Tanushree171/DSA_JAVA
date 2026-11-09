package PatternString04;

import java.util.Scanner;

public class FlippedTriangleMethod2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){//for blank spaces or inverted triangle
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){ // for stars
                System.out.print("* ");// for numbers use j sout(j+" ");
            }
            System.out.println();
        }
    }
}
