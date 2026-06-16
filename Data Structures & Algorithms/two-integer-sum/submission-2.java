class Solution {
    public int[] twoSum(int[] nums, int target) {
        //  Element, Index
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
            map.put(nums[i], i);
    
        for(int i=0; i<nums.length; i++) {
            int need = target - nums[i];
            if(map.containsKey(need) && i != map.get(need)) {
                return new int[]{i, map.get(need)};
            }
        }

        return new int[]{-1, -1};
    }
}
