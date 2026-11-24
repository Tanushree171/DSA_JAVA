package Arrays06;

public class ReverseArray {
    static void main() {
        int []arr = {6,8,1,2,4,9,7,5,3};
        int n = arr.length;
        int i =0, j=n-1;
        while(i<j){
            int temp = arr[i]; // temp is used for swapping
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele: arr) System.out.print(ele+" ");
    }
}
