public class Poly6 {
    public static void main(String[] args) {
        First f = new Second();
        f.doIt(); // compiler error -- method doIt() is undefined for the type First
    }
}
class First {int i = 0;}
class Second extends First {
    public void doIt() {}
}
