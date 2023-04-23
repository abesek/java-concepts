import java.util.HashMap;
import java.util.Map.Entry;

class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Adam");
        map.put(2, "Angel");
        map.put(2, "Chris");
        map.put(3, "Charles");
        map.get(1);
        map.remove(1);

        for (Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}