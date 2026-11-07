package PatternString04;

import java.util.Scanner;

public class TriangleHorizontallyFlipped {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int a=n; // this indicates number of star to be printed in each line
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n+1-i;j++){ // so here it will become for(int j=1;j<=a;j++)
                System.out.print("*"+" ");   // System.out.print(j+" "); this is for integer
            }
            // a--; so this another form we can do to print it
            System.out.println();
        }
    }
}
