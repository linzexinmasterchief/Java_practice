package HashTest.HashMapTest;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");
        hashMap.put(5, "e");
        System.out.println(hashMap.get(3));
    }
}
