package s2_linked_lists.q2_2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class ReturnKthToLastTest {
    @Test
    public void basic() {
        int[] elems = {1, 2, 3, 4, 5};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(elems);
        assertEquals(1, ReturnKthToLast.returnKthToLast(head, 5));
        assertEquals(2, ReturnKthToLast.returnKthToLast(head, 4));
        assertEquals(3, ReturnKthToLast.returnKthToLast(head, 3));
        assertEquals(4, ReturnKthToLast.returnKthToLast(head, 2));
        assertEquals(5, ReturnKthToLast.returnKthToLast(head, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void kLessThan1() {
        int[] elems = {1, 2, 3, 4, 5};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(elems);
        ReturnKthToLast.returnKthToLast(head, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void kGreaterThanSize() {
        int[] elems = {1, 2, 3, 4, 5};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(elems);
        ReturnKthToLast.returnKthToLast(head, 6);
    }
}
