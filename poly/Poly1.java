/*      method of concrete type executed

        Output:

        In class First
        In class First with 1 param method
        In class Second
        In class Second with 1 param method
        In class Second
        In class Second with 1 param method */
public class Poly1 {
    public static void main(String[] args) {
        First o = new First();
        First t = new Second();
        Second t1 = new Second();
        o.print(); 
        o.print("");        
        t.print(); 
        t.print("");
        t1.print(); 
        t1.print("");
    }
}
class First {
    public void print() {
        System.out.println("In class First");
    }    
    public void print(String s) {
        System.out.println("In class First with 1 param method");
    }
}
class Second extends First {
    public void print() {
        System.out.println("In class Second");
    }
    public void print(String s) {
        System.out.println("In class Second with 1 param method");
    }
}
