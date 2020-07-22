package LinkedListTest;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(6);

        for (int i : linkedList) {
            System.out.println(i);
        }
    }
}
