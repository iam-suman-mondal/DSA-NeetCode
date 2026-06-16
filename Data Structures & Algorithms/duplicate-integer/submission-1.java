class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);

        for(Map.Entry<Integer, Integer> set : map.entrySet()) {
            if(set.getValue() > 1) return true;
        } 

        return false;
    }
}