class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        List<Pair<Integer, Integer>> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Pair<Integer, Integer> p = new Pair(entry.getKey(), entry.getValue());
            arr.add(p);
        }

        Collections.sort(arr, (a, b) -> b.value() - a.value());

        int[] ans = new int[k];

        for(int i=0; i<k; i++) {
            ans[i] = arr.get(i).key();
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
