package Arrays06;

public class MaximumElement {
    static void main() {
        int arr [] = {-6,8,14,-2,23,47,4,3,10};
        int max = arr[0];//int max = Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
        System.out.println(max);
    }
}
