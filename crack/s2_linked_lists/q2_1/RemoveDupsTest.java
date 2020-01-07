package s2_linked_lists.q2_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class RemoveDupsTest {
    @Test
    public void noDups() {
        int[] elems = {1, 2, 3, 4, 5};
        int[] expectedElems = {1, 2, 3, 4, 5};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(elems);
        LinkedListNode expectedHead = AssortedMethods.createLinkedListFromArray(expectedElems);
        head = RemoveDups.removeDups(head);
        assertLinkedListEquals(head, expectedHead);
    }

    @Test
    public void nullList() {
        LinkedListNode head = null;
        head = RemoveDups.removeDups(head);
        assertEquals(null, head);
    }

    @Test
    public void oneElement() {
        int[] elems = {1};
        int[] expectedElems = {1};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(elems);
        LinkedListNode expectedHead = AssortedMethods.createLinkedListFromArray(expectedElems);
        head = RemoveDups.removeDups(head);
        assertLinkedListEquals(head, expectedHead);
    }

    @Test
    public void oneDup() {
        int[] elems = {1, 1};
        int[] expectedElems = {1};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(elems);
        LinkedListNode expectedHead = AssortedMethods.createLinkedListFromArray(expectedElems);
        head = RemoveDups.removeDups(head);
        assertLinkedListEquals(head, expectedHead);
    }

    @Test
    public void multipleDups() {
        int[] elems = {3, 1, 1, 2, 2, 3, 4, 5, 3};
        int[] expectedElems = {3, 1, 2, 4, 5};
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(elems);
        LinkedListNode expectedHead = AssortedMethods.createLinkedListFromArray(expectedElems);
        head = RemoveDups.removeDups(head);
        assertLinkedListEquals(head, expectedHead);
    }

    private void assertLinkedListEquals(LinkedListNode head1, LinkedListNode head2) {
        for (LinkedListNode curr1 = head1, curr2 = head2;
                curr1 != null || curr2 != null;
                curr1 = curr1.next, curr2 = curr2.next) {
            assertEquals(curr2.data, curr1.data);
        }
    }
}