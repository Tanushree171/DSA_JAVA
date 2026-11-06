package PatternString04;

import java.util.Scanner;

public class AlphabetSquare4 {
        static void main() {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1; i<=n;i++){
                char ch;
                if(i%2!=0) {
                    ch = (char) (i + 96);
                } else {
                    ch= (char) (i+64);
                }
                for (int j=1;j<=n;j++){
                    System.out.print(ch+ " ");
                }
                System.out.println();
            }
        }
    }

