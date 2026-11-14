package Arrays06;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    static void main() {
        int [] arr ={ 10,20,30,40};
        int [] x=arr;// x is shallow copy of arr
        x[0] = 100;
      //  int []y  = Arrays.copyOf(arr,arr.length); // deep copy
      //  y = 100;
        System.out.println(arr[0]);
    }
}
// shallow copy is where we can access the original copy from another source by mentioning it