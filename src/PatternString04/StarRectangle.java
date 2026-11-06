package PatternString04;

import java.util.Scanner;

public class StarRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                System.out.print("* ");// there is space after * it has given just to make little space b/w the stars instead of this ****
            }
            System.out.println();
        }
    }
}
