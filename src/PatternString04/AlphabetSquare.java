package PatternString04;

import java.util.Scanner;

public class AlphabetSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n;j++){
                System.out.print((char)(j+64)+ " ");// typecasting is done here as we have to print the char we have to put the char in the condition and j is added with the ascii value A
            }// For A ascii value is 65 and for a ascii value starts from 97
            System.out.println();
        }
    }
}
// so to print small case alphabet just do one change System.out.print((char)(j+96)+ " ");