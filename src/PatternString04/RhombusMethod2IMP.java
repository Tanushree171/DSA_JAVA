package PatternString04;

import java.util.Scanner;

public class RhombusMethod2IMP {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int nsp =n-1,nst=1;// nsp=number of space and nst = number of stars these are the initials
        for (int i=1;i<=n;i++){
            for (int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;// number of spaces are decreasing here
            nst+=2;// number of stars are increasing by 2
            System.out.println();
        }
    }
}
