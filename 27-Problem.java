class Solution {
    public int removeElement(int[] nums, int val) {
        int end = nums.length - 1;
        int start = 0;
        while(start <= end) {
            if(nums[start] == val) {
                nums[start] = nums[end];
                end--;
            } else {
                start++;
            }
        }
        return start;
    }
}
