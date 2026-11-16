package Arrays06;

public class TwoSum {
    static void main() {
        System.out.println("Two Sum:");
    }
     boolean twoSum(int arr [], int target) {
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==target)
                    return true;
            }
        }
        return false;
    }
}
