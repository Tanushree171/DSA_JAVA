package Arrays06;

public class SearchInArray {
    static void main() {
        int [] arr ={12,17,8,69,61,29};
        int target =69;
        boolean flag = false; // false means target does not contain array
        for (int i=0;i<arr.length;i++){
            if( arr [i] ==  target){
                flag = true; // true means target is there in the array
                break;
            }
        }
        if (flag ==true) System.out.println("Target exists in array");
        else System.out.println("Target is missing in array");
    }
}
