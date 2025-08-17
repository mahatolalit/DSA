package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println("Element " + iter.next());
        }
    }
}
