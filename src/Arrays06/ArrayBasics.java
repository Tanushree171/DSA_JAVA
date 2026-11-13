package Arrays06;

public class ArrayBasics {
    static void main() {
        int [] x ={8,17,29,61,69};
        // indexing
        System.out.println(x[0]);
        // updating elements -mutability property
        x[3]=89;
        System.out.println(x[3]);
        /* another method to put new variables into int
        int [] arr= new int[4]; // indexing will be from 0 to 3
       arr [0] = 12;
      arr [1] =14;
        arr [2] =17;
        arr [3] =19; */
    }
}
