package Arrays06;

public class SecondMaximumElement {
    static void main() {
        int [] arr ={ 5,10,10,7,3,8};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        // calculate max
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max) max = arr[i];
        }
        // Calculating second max
        for (int i=0;i< arr.length;i++){
            if (arr[i]> smax && arr[i]!=max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
