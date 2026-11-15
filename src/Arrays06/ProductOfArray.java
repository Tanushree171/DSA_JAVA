package Arrays06;

public class ProductOfArray {
    static void main() {
        //Product Of Array
        int arr [] = {1,2,3,4,5,67};
        int product = 1;
        for (int i=0;i< arr.length;i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
