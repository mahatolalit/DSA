package Set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(7);
        set.add(3);
        set.add(6);
        set.add(1);
        set.add(8);

        System.out.println("Set = " + set);

        System.out.println("set.remove(6)");
        set.remove(6);

        System.out.println("New Set = " + set);

        System.out.println("Does set contain 50? " + set.contains(50));

        System.out.println("Size of set = " + set.size());

        System.out.println("set.clear()");
        set.clear();

        System.out.println("Is set empty? " + set.isEmpty());

        System.out.println(set);

    }
}
