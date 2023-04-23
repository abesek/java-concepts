import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Adam");
        set.add("Angel");
        set.add("Chris");
        set.add("Charles");
        set.remove("Chris");

        for (String e : set) {
            System.out.println(e);
        }
    }
}
