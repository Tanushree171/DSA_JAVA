package Arrays06;

public class ReverseArray2 {
    static void main() {
        int [] arr ={6,8,4,2,1,9,5,3,7};
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            // swap arr[i] and arr[n-1-i]
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] =temp;
        }
        for (int ele:arr) System.out.print(ele+" ");
    }
}
