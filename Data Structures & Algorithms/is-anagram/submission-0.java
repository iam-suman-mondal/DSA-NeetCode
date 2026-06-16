class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arr = new int[26];

        for(char ch : s.toCharArray()) {
            int index = ch-'a';
            arr[index] += 1;
        }

        for(char ch : t.toCharArray()) {
            int index = ch-'a';
            arr[index] -= 1;
        }

        for(int i : arr) {
            if(i != 0) return false;
        }

        return true;
    }
}
