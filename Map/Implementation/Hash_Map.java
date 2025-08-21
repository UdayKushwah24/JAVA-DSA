package Map.Implementation;
import java.util.*;
public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raj", 77);
        map.put("Kunal", 97);
        map.put("Ankit", 97);
        map.put("Ankita", 76);
        map.put("Raj", 100);  // value override
        System.out.println(map);
        System.out.println(map.get("Kaju"));
        System.out.println(map.get("Kunal"));

        

    }
}
