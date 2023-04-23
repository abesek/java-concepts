// no errors - prints In class First
public class Poly3 {
    public static void main(String[] args) {
        Second.print(); //In class First
    }
}
class First {
    public static void print() {
        System.out.println("In class First");
    }   
}
class Second extends First {
    
}