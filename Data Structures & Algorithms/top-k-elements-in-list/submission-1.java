class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.value() - b.value());
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new Pair(entry.getKey(), entry.getValue()));
            if(pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];
        for(int i=0; i<k; i++) {
            ans[i] = pq.poll().key();
        }

        return ans;
    }

    public class Pair<k, v> {
        public k key;
        public v value;

        Pair(k key, v value)  {
            this.key = key;
            this.value = value;
        }

        public k key() {
            return key;
        }

        public v value() {
            return value;
        }
    }
}
