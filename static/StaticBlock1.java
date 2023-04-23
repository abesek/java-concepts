public class StaticBlock1 {
    // Output:
    // Inside static block   --- it prints!!!
    // runtime error: can't find main(String[]) method in class: StaticBlock1

    static {
        System.out.println("Inside static block");
    }
}
