/* 
 * 2 4 6 8 10 12 In the end: 14
 */
public class Loop1 {
    public static void main(String[] args) {
        int a = 1;
        for (; a < 14; a++) {
            if (a % 2 > 0) {
                continue;
            } else {
                System.out.print(a + " ");
            }
        }
        System.out.println("In the end: " + a);
    }
}
