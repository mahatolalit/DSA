package List;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> cities = new Stack<>();

        cities.push("Mumbai");
        cities.push("Prayagraj");
        cities.push("Varanasi");
        cities.push("Chennai");

        System.out.println("Stack " + cities);

        System.out.println(cities.peek());

        cities.pop();
        System.out.println(cities);

        System.out.println(cities.peek());

        cities.push("Darjeeling");
        System.out.println(cities);
        
        System.out.println(cities.peek());


    }
}
