class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];

        // initialize the bucket
        for(int i=0; i<=nums.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // count freequency
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        // put in bucket
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i=bucket.length-1; i>0 && index < k; i--) {
            for(int n : bucket[i]) {
                ans[index++] = n;

                if(index == k)
                    return ans;
            }
        }

        return ans;
    }
}
