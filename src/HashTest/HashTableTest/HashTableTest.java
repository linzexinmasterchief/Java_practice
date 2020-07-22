package HashTest.HashTableTest;

import java.util.Hashtable;

public class HashTableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "a");
        hashtable.put(2, "b");
        hashtable.put(3, "c");
        hashtable.put(4, "d");
        hashtable.put(5, "e");
        System.out.println(hashtable.entrySet());

    }
}
