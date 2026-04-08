class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> liste = new ArrayList<>();
        int max = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int element : set) {
            if (!set.contains(element - 1)) {
                liste.add(element);
            }
        }
        int a = set.size() - liste.size();
        for (int e : liste) {
            int m = 1;
            for (int k = e + 1; k <= e + a; k++) {
                if (set.contains(k)) {
                    m++;
                }else {
                    break;
                }
            }
            if (max < m) max = m;
        }
        return max;
    }
}
