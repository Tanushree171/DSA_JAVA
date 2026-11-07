package PatternString04;

import java.util.Scanner;

public class StarPlusSign {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        for(int i=1;i<=m;i++){
            for (int j=1;j<=m;j++){
                if (i==n/2+1 || j==n/2+1)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
