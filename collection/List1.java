import java.util.ArrayList;

public class List1 {
    static ArrayList<String> items;
    public static void main(String[] args) {
        int a = 0;
        while(a < items.size()) {
            a++;
            System.out.println(items.get(a)); // runtime error when items non-empty -- ArrayIndexOutOfBounds
        }
    }
}
