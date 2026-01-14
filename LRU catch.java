import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    public static void main(String[] args) {
        Map<Integer, String> cache =
            new LinkedHashMap<>(3, 0.75f, true) {
                protected boolean removeEldestEntry(Map.Entry<Integer, String> e) {
                    return size() > 3;
                }
            };

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.put(4, "D");

        System.out.println(cache);
    }
}
