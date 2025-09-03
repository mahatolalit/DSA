class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n]; 
        
        // Add prefix products to answer array 
        for (int i = 0, prefix = 1; i < n; i++ ) {
            answer[i] = prefix; 
            prefix *= nums[i]; 
        } 
                                   
        // Multiply with suffix products
        for (int i = n - 1, suffix = 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        return answer;
    }
}