// compiler error
public class Poly2 {
    public static void main(String[] args) {
        
    }
}
class First {
    public static void print() {
        System.out.println("In class First");
    }    
    public void print(String s) {
        System.out.println("In class First with 1 param method");
    }
}
class Second extends First {
    public void print() { // Instance method cannot override static method
        System.out.println("In class Second");
    }
    public static void print(String s) { // static method cannot hide instance method
        System.out.println("In class Second with 1 param method");
    }
}
