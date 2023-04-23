public class Type2 {
    public static void main(String[] args) {
        First f = new First();
        Second s = (Second) f; // runtime exception -- ClassCastException: class First cannot be cast to class Second
        System.out.println(s.getA());
    }
}
class First {
    int a = 10;
    public int getA() { return a; }
}
class Second extends First {
    int a = 20;
    public int getA() { return a; }
}
