package Methods05;

public class PassByValueAndReference {
    static void change(int x ) {
        x=10;
    }
    static void main() {
        int x =6;
        System.out.println(x);
    change(x);// here only values goes
        System.out.println(x);
    }
}
