package LinkedListTest;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(8);
        linkedList.add(6);

        for (int i = 0; i < linkedList.size(); i ++){
            System.out.println(linkedList.get(i));
        }
    }
}
