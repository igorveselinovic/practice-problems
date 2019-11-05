import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.lang.IndexOutOfBoundsException;

public class LinkedListTest {
    @Test
    public void create() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        assertEquals(0, list.getSize());
    }

    @Test
    public void add() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(0);
        assertEquals(1, list.getSize());
        list.add(7);
        assertEquals(2, list.getSize());
    }

    @Test
    public void add_indexed() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(0, 100);
        assertEquals(100, list.get(0).intValue());
        assertEquals(1, list.getSize());
        list.add(0, 200);
        assertEquals(200, list.get(0).intValue());
        assertEquals(100, list.get(1).intValue());
        assertEquals(2, list.getSize());
        list.add(1, 300);
        assertEquals(200, list.get(0).intValue());
        assertEquals(300, list.get(1).intValue());
        assertEquals(100, list.get(2).intValue());
        assertEquals(3, list.getSize());
        list.add(3, 400);
        assertEquals(100, list.get(2).intValue());
        assertEquals(400, list.get(3).intValue());
        assertEquals(4, list.getSize());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void add_outOfBounds() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1, 10);
    }

    @Test
    public void get() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(11);
        list.add(12);
        assertEquals(7, list.get(0).intValue());
        assertEquals(8, list.get(2).intValue());
        assertEquals(12, list.get(4).intValue());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_outOfBounds() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.get(0);
    }

    @Test
    public void remove() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(0);
        assertEquals(4, list.getSize());
        assertEquals(1, list.get(0).intValue());
        list.remove(3);
        assertEquals(3, list.getSize());
        assertEquals(3, list.get(2).intValue());
        list.remove(1);
        assertEquals(2, list.getSize());
        assertEquals(1, list.get(0).intValue());
        assertEquals(3, list.get(1).intValue());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove_outOfBounds() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.remove(0);
    }
}