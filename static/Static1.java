public class Static1 {
    int a = 0;
    public static void main(String[] args) {
        this.a = 1; // compiler error -- Cannot use 'this' keyword in a static context
        a = 1; // compiler error -- Cannot make static reference to non-static field 'a'
    }
}
