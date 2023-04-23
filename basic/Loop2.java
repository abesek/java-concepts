import java.util.ArrayList;

public class Loop2 {
    public static void main(String[] args) {
        int a = 0;
        ArrayList<String> pets = new ArrayList<>();
        pets.add("catty");
        pets.add("doggy");
        while(a < pets.size()) {
            a = a++; // a not incremented. Hence Infinite loop
            System.out.println(pets.get(a));
        }
    }
}
