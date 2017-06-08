public class IntNode{
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n){
        item = i;
        next = n;
    }
}

/**
 * int: Integer
 * double: Double
 * char: Character
 * boolean: Boolean
 * long: Long
 * /



/*******************************
 *  private 
 *  less for user of class to understand
 *  safe for you to change private methods(implementation)
 */


/** An SLList is a list of integers, which hides the terrible truth 
 * of the nakeness within. */

public class SLList {
    
    /** Nested class */
    private static class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    //public IntNode first;
    // using private to prevent other classes use first

    private IntNode first;
    private int size;
    /** the first item (if it exists) is a at sentinel.next. */
    private IntNode sentinel;

    /** Creates an empty SLList. */
    public SLList() {
        first = null;
        size = 0;
        sentinel = new IntNode(63, null);
    }

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** Returns first item of the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    /** Add an item to the end of the list. */
    public void addLast(int x){
        size += 1
        IntNode p = sentinel;

        /**if (first == null) {
            first = new IntNode(x, null);
            return;
        }*/

        /** Advance p to the end of list. */
        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Returns the size fof the list that starts at IntNode p. */
    private static int size(IntNode p) {
        if (p.next == null){
            return 1;
        }
        
        return 1 + size(p.next);
    }

    public int size(){
        return size(sentinel.next);
        //return size(first);
        /**
        IntNode p = first;
        int nums = 0;
        while (p.next != null){
            nums += 1;
            p = p.next;
        }
        return nums; */
    }

    public static void main(String[] args) {
        /* Creates a list of one integer, namely 10 */
        SLList L = new SLList(10);
    }

}


