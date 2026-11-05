package Loops03;

import java.util.Scanner;

public class ASCIIValues {
    //Print all Alphabets with their corresponding ASCII values
    static void main() {
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i + " " + i);
        }
    }
}