class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n < 2)
            return; // trivial case skip

        k %= n;

        if (k == 0)
            return; // rotation not needed

        // Step 1: reverse entire array
        for (int l = 0, r = n - 1; l < r; l++, r--) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
        }

        // Step 2: reverse first k
        for (int l = 0, r = k - 1; l < r; l++, r--) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
        }

        // Step 3: reverse last n-k
        for (int l = k, r = n - 1; l < r; l++, r--) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
        }
    }
}
