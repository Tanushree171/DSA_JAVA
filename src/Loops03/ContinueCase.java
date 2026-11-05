package Loops03;

public class ContinueCase {
    static void main() {
        for (int i=1; i<=20;i++){
            System.out.println(i);
            if (i==13) continue; // skip the iteration
            System.out.println("Good Evening!");

        }
    }
}
