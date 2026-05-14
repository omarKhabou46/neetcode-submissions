class Solution {
    public int findDuplicate(int[] nums) {
      int[] aide = new int[nums.length];
     for (int i = 0; i < nums.length; i++) {
       if (aide[nums[i] - 1] == 0) {
           aide[nums[i] - 1] = nums[i];
       }else return nums[i];
     }
       return 0;
    }
}
