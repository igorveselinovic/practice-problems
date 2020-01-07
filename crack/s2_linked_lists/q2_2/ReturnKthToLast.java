package s2_linked_lists.q2_2;

import CtCILibrary.LinkedListNode;
import java.util.ArrayList;

public class ReturnKthToLast {
    public static int returnKthToLast(LinkedListNode head, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (k < 1) throw new IllegalArgumentException();

        for (LinkedListNode curr = head; curr != null; curr = curr.next) {
            list.add(curr.data);
        }

        if (k > list.size()) throw new IllegalArgumentException();
        return list.get(list.size() - k);
    }
}