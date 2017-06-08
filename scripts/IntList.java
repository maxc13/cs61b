public class IntList{
    public int head;     /* Equivalent of first*/
    public IntList tail; /* Equivalent if rest */

    public IntList(int h, IntList t){
        head = h;
        tail = t;
    }

    /* Returns the number of integers in this IntList,
     * using ... recursion! */
    public int size(){
        /* If tail is null, the list has just one item */
        if (tail == null){
            return 1;
        }
        return 1 + tail.size();
    }

    /* Returns the number of integers in this IntList,
     * using ... no recursion. */
    public int sizeIterative(){
        IntList p = this;
        int size = 0;
        while (p != null) {
            size += 1;
            p = p.tail;
            }
        return size;
    }

    /* Return the ith item in IntLsit, start from 0 */

    public int get(int i){
        IntList p = this;
        int index = 0;
        int result;
        while (index < i){
            p = p.tail;
            index += 1;
        }
        return p.head;
    }

    /* Using recursion to return ith item of this Intlist */

    public int getRecursion(int i){
        if (i == 0){
            return head;
        }

        return tail.getRecursion(i - 1);
    }

    public static void main(String[] args){
        IntList L = new IntList(5, null);
        L = new IntList(10, L);
        L = new IntList(15, L);

        /* Prints front item */
        System.out.println(L.head);
        System.out.println(L.get(0));

        /*System.out.println(L.size());*/

        /* Prints item behind first item */
        System.out.println(L.tail.head);
        System.out.println(L.get(1));
    }
}

