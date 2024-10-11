import java.util.ArrayDeque;
import java.util.Deque;

class DoubleEndQueue {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        d.addFirst(1);
        d.addLast(4);
        d.addFirst(2);
        d.addLast(1);
        d.addFirst(4);
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}