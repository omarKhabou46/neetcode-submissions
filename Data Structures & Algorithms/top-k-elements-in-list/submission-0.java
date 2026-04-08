class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int size = nums.length;
        int[] output = new int[k]; 
        List<List<Integer>> liste = new ArrayList<>(size + 1);
        for (int i = 0; i < size; i++) {
            int a = nums[i];
            if (!map.containsKey(a)) {
                map.put(nums[i], 1);
            }else {
                int count = map.get(a);
                map.put(a, ++count);
            }
        }

        for (int i = 0; i <= size; i++) { 
             liste.add(new ArrayList<>());
        }
        
        map.forEach((key, value) -> {
          List<Integer> list1 = liste.get(value);
          list1.add(key);
          liste.set(value, list1);
        });

        for (int i = size; i >= 1; i--) {
            List<Integer> list1 = liste.get(i);
            if (!list1.isEmpty()) {
                if (k != 0) {
                 for (int j = 0; j < list1.size(); j++) {
                    output[--k] = list1.get(j);
                    if (k == 0) {
                        break;
                    }
                 }
                }
                }
            }
    return output;

    }
}
