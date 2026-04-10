class Solution {
   public  List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listeOfListe = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (i != 0 && a == nums[i - 1]) continue;
            if (a > 0) return listeOfListe;
            int k = i + 1;
            int j = nums.length - 1;
            while (k < j) {

                int sum = a + nums[k] + nums[j];
                if (sum > 0) j--;
                else if (sum < 0) k++;
                else {
                    listeOfListe.add(Arrays.asList(a, nums[k], nums[j]));
                    k++;
                    j--;
                    while (nums[k] == nums[k - 1] && k < j) {
                        k++;
                    }
                     while (nums[j] == nums[j + 1] && k < j) {
                        j--;
                    }

                    
                }
            }

        }
        return listeOfListe;
    }

}
