class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums) {
            int frequency = map.getOrDefault(i, 0)+1;
            if(frequency > 1) 
                return true;
            else 
                map.put(i, frequency);
        }

        return false;
    }
}