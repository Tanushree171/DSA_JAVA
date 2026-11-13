package Arrays06;

import java.util.Scanner;

public class NegativeValues {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter array elements:");
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        // Printing negative elements
        for (int i=0;i<n;i++)
          if (arr[i]<0) System.out.print(arr[i]+" ");
    }
}
