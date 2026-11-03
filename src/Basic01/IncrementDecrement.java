package Basic01;

public class IncrementDecrement {
    static void main() {
        int x = 17;
        System.out.println(x++); // first use it then increment so it will become 18
        System.out.println(++x);
        int z = 10;
        int y = ++z;
        System.out.println(z+ " "+y);
    }
}
