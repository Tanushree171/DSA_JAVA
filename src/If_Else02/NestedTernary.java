package If_Else02;

import java.util.Scanner;

public class NestedTernary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c = sc.nextInt();
       // Nested if else condition: if (a>b){
           // if(a>c) System.out.println(a);
            //else System.out.println(c);
        //}
       // else { //b>a
        //    if (b>c) System.out.println(b);
         //   else System.out.println(c);
       //Nested Ternary Condition: (a>b) ? ((a>c) ? a :c): ((b>c) ? b : c)
    }
}
