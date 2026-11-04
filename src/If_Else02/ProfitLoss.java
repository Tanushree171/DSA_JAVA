package If_Else02;

import java.util.Scanner;

public class ProfitLoss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP:");
        int cp = sc.nextInt();
        System.out.println("Enter SP:");
        int sp = sc.nextInt();
     if ( sp>cp) System.out.println("Profit");
    else System.out.println("Loss");
    }
}
