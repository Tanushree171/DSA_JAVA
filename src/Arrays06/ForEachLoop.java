package Arrays06;

public class ForEachLoop {
    static void main() { // used to traverse data structures here elements cannot modify
    int[] arr={5,8,7,9,6}; // here one copy of the element is being form
   for (int ele : arr){ // to print the array it is read out like for int array
   //     System.out.print(ele+" ");
    }
    for (int i=0; i< arr.length;i++){
        arr[i] *=2;
    }
    for (int ele: arr){
        System.out.print(ele+" ");
    }
    }
}
// this is used to display the element if we have to make any changes then like line 9 we have to give the condition