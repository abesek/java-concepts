/* 
 * Output:
 * 
 * Inside First Static Block. Value of b = 0
 * Inside Static method
 * Inside Second Static Block. Value of b = 8
 * Enter main method
 * Inside First Instance Block. Value of a = 0
 * Inside Second Instance Block. Value of a = 2
 * Inside Instance method
 * Inside Order1 Constructor
 * Exit main method
 */
public class Order1 {
    int a;
    static int b;
    {
        System.out.println("Inside First Instance Block. Value of a = " + a);
    }
    static {
        System.out.println("Inside First Static Block. Value of b = " + b);
        method2();
    }
    {
        a = 2;
    }
    static {
        b = 8;
    }

    Order1() {
        System.out.println("Inside Order1 Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Enter main method");
        Order1 o = new Order1();
        System.out.println("Exit main method");
    }

    public void method1() {
        System.out.println("Inside Instance method");
    }

    static {
        System.out.println("Inside Second Static Block. Value of b = " + b);
    }
    {
        System.out.println("Inside Second Instance Block. Value of a = " + a);
        method1();
    }

    public static void method2() {
        System.out.println("Inside Static method");
    }
}
