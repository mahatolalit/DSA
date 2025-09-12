class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for (int l = 0, r = n - 1; l < r; l++, r--) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
        }
    }
}