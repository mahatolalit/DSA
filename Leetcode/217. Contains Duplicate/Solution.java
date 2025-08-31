import java.util.HashSet;
import java.util.Set;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> hset = new HashSet<>(); // Create a HashSet

        // Loop for Iterating over each element

        for(int n : nums) {

            if (hset.contains(n)) // Check if the number exists in array

                return true; // If exists return true

            hset.add(n); // Add no. to HashSet

        }

        return false;

    }

}