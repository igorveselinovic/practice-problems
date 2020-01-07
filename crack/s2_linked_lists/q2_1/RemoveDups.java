package s2_linked_lists.q2_1;

import CtCILibrary.LinkedListNode;

import java.util.HashSet;

public class RemoveDups {
    public static LinkedListNode removeDups(LinkedListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (LinkedListNode curr = head, prev = null; curr != null; curr = curr.next) {
            if (set.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                set.add(curr.data);
                prev = curr;
            }
        }

        return head;
    }
}