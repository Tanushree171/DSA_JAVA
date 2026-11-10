package Methods04;

public class Arguments {
    static void max(int a, int b, int c) { //parameters
        if (a>=b && a>=c) System.out.println(a);
        else if (b>=a && b>=c) System.out.println(b);
        else System.out.println(c);
        }
    static void main() {
        max(4,8,9);//arguments
    }
    }

