package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(70);
        set.add(31);
        set.add(67);
        set.add(11);
        set.add(84);

        System.out.println("Set = " + set);

        System.out.println("set.remove(67)");
        set.remove(67);

        System.out.println("New Set = " + set);

        System.out.println("Does set contain 50? " + set.contains(50));

        System.out.println("Size of set = " + set.size());

        System.out.println("set.clear()");
        set.clear();

        System.out.println("Is set empty? " + set.isEmpty());

        System.out.println(set);

    }
}
