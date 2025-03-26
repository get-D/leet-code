class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        
        if (nums.length == 2) {
            arr[0] = 0;
            arr[1] = 1;
            return arr;
        }
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr; 
                }
            }
        }
        
        return arr; 
    }
}