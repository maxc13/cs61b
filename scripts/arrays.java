/**Arrays:
 * A fixed integer length(cannot change!)
 * A sequence of N memory boxes where N=length, such that:
 *  All of the boxes hold the same type value(and have same # of bits)
 *  The boxes are numbered 0 through length-1
 */

arraycopy
/**
 * two ways to copy arrays:
 *  Item by item using a loop
 *  Using arraycopy. Takes 5 parameters:
 *   Source array
 *   Start position in source 
 *   Target array
 *   Start position in trget
 *   Number to copy
 *   System.arraycopy(b, 0, x, 3, 2) 
 *   equals in python: x[3:5] = b[0:2]
 *
 * arraycopy is (likely to be) faster, particularly for large arrays. More compact code.
 */

public class Alist<Item> {
    /* the stored integers */
    private Item [] items;
    private int size;
    private int static RFACTOR = 2

    /** Creates an empty list. */
    public Alist() {
        size = 0;
        //THIS IS A SPECIAL SYNTAX
        items = (Item[]) new Objecy[100];
    }
    /** Resize our backing array so that it is 
     * of the given capacity */
    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Inserts X into the back of the list. */
    public void insertBack(int x) {
        //resizing the items when item > items.length
        if (size == items.length) {
            resize(size * RFACTOR);// this is how Python do
        }

        items[size] = x;
        // the position starts from 0
        size = size + 1;
    }

    /** Returns the item from the back of the list. */

    public Item getBack(){
        int lastActualItemIndex = size - 1;
        return items[lastActualItemIndex ];
    }

    /** Gets the ith item of the list (0 is the first item). */
    public Item get(int i) {
        return items[i];
    }

    /** Reuturns the size of the list */
    public int size() {
        return size;
    }
    
    /** Deletes item from back of the list and 
     * returns deleted item */
    public Item deleteBack() {
        int returnItem = getBack();
        /** setting to 0 is not strictly necessary,
         * but it's a good habit. */
        item[size - 1] = null;
        size = size - 1;
        return returnItem;
    }

