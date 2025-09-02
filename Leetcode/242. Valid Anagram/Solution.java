class Solution {
    public boolean isAnagram(String s, String t) {
        // Anagrams must have the same length.
        if (s.length() != t.length()) {
            return false;
        }

        // Frequency array for 26 lowercase letters.
        int[] characterCounts = new int[26];

        // Increment count for chars in s, decrement for chars in t.
        for (int i = 0; i < s.length(); i++) {
            characterCounts[s.charAt(i) - 'a']++;
            characterCounts[t.charAt(i) - 'a']--;
        }

        // If s and t are anagrams, all counts will be zero.
        for (int n : characterCounts) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }
}