class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] tab = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if (map.containsKey(rest)) {
                tab[0] = map.get(rest);
                tab[1] = i;
                return tab;
            }
            map.put(nums[i], i);
        }
        return tab;
    }
}
