package Methods04;

public class Syntax {
    static void main() {// this is our main function it will always and always runs first
        taanu(); // here main function is calling function name taanu
    }
    static void taanu() {// so it will come here after the main function
        System.out.println("jaanu"); // and sees this it will get print first
        ashi();// then after printing it sees another function name ashi so it will go there
    }
    static void ashi() {//it comes here after taanu function
        Tanushree();// but here instead of printing akriti it sees here another function has been called which is Tanushree so it will go there
        System.out.println("akriti");// then after completing function Tanushree it comes here and print yhe final thing which is akriti
    }
    static void Tanushree() {// it comes here after function ashi
        System.out.println("Jay");// and print this first
    }
}
