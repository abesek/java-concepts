public class IncDec1 {
    public static void main(String[] args) {
        //0 2 4
        for (int a = 0; a < 5; a++) {
            a = a++;
            System.out.print(a++ + " ");
        }
        System.out.println();

        //1 3 5
        for (int a = 0; a < 5; a++) {
            a = a++;
            System.out.print(++a + " ");
        }
        System.out.println();

        //2 5
        for (int a = 0; a < 5; a++) {
            ++a;
            System.out.print(++a + " ");
        }
        System.out.println();

        //1 4
        for (int a = 0; a < 5; a++) {
            a++;
            System.out.print(a++ + " ");
        }
        System.out.println();

        //1 3 5
        for (int a = 0; a < 5; ) {
            a++;
            System.out.print(a++ + " ");
        }
        System.out.println();
    }
}
