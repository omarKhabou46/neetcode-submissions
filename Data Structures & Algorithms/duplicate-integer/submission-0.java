class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Map<Integer, Boolean> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(nums[i])) {
        //         return true;
        //     }else {
        //         map.put(nums[i], true);
        //     }
        // }
        // return false;
        List<Integer> liste = new ArrayList<>();
        for (int i = 0, j = i + 1; j < nums.length; j++) {
            int a = nums[i] - nums[j];
            if (liste.contains(a) || a == 0) {
               return true;
            }else {
                liste.add(a);
            }
        }
        return false;
    }
}