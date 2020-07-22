package HashTest.HashMapTest;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");
        hashMap.put(5, "e");
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());

        // thread safe -> less efficient
        // however, concurrent hash map does not use java lock system
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "a");
        concurrentHashMap.put(2, "b");
        for (int i = 1; i < concurrentHashMap.size() + 1; i++) {
            System.out.println(concurrentHashMap.get(i));
        }
    }
}
