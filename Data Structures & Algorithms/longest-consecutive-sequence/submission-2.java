class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();

        for(int num : nums) 
            set.add(num);

        int longestSequence = 0;
        for(int i=0; i<nums.length; i++) {
            int curr = nums[i]; // current element
            if(!set.contains(curr-1)) { // starting point of a sequence
                int currSeq = 1;
                while(set.contains(curr+1)) {
                    currSeq++;
                    curr++;
                } 
                
                longestSequence = currSeq > longestSequence ? currSeq : longestSequence;
            }
        }

        return longestSequence;
    }
}
