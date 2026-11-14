package Arrays06;

public class PassingArrayTwoFunctions {
    static void main() {
        int[] x={10,20,30,40,50};
        System.out.println(x[2]);
        change(x); // used to change something in code like array or int anything
        System.out.println(x[2]);
    }
    static void change(int [] y){// y is reference here
        y[2] = 20;
    }
}
