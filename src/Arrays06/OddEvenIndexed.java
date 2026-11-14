package Arrays06;

import java.util.Arrays;

public class OddEvenIndexed {
    static void main() {
        int [] arr ={10,20,30,40,50,60};
        for (int i=0;i< arr.length;i++){
            if (i%2 == 1) {
                arr[i] *=2; // odd index:multiply by 2
            }
            else{
                arr[i] +=10; // even index : add ny 10
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
