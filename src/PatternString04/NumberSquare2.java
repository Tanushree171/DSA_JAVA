package PatternString04;

import java.util.Scanner;

public class NumberSquare2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print((i+64)+  " ");
            }
            System.out.println();
        }
    }
}
//System.out.print((char)(i+64)+ " "); this to print continuous capital alphabet