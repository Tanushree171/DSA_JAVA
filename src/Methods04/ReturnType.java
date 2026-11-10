package Methods04;

public class ReturnType {
    static void int taanu() {
        System.out.println("Jaanu");
        System.out.println("Ashi");
        return 8; // return type is used when in place of void any other datatype is used
    }

    static void main() {
        int x= taanu();// method call
        System.out.println(3+x);
        //taanu(); stand alone call
    }
}
