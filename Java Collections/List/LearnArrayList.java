package List;
import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>(); 
        list.add(20);
        list.add(50);
        list.add(70);

        list.addAll(newList); //adding two lists
        System.out.println(list);

        list.add(3,200); //adding an elemnt at a specific index

        int a = list.get(2); //fetching a specific element
        System.out.println(a);

        list.remove(Integer.valueOf(50)); // removing an element
        System.out.println(list);

        list.set(4, 1000); //updating an element
        System.out.println(list);

        System.out.println(list.contains(50)); //checking for an element if exists in list

        list.clear(); // Clear the list
        System.out.println(list);

    }
}