class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l < r) {
            while(l < r && !isCharOrDigit(s.charAt(l)))
                l++;
            
            while(l < r && !isCharOrDigit(s.charAt(r)))
                r--;

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;

            l++;
            r--;
        }

        return true;
    }

    public boolean isCharOrDigit(char c) {
        return (c >= 'A' && c <= 'Z') || 
            (c >= 'a' && c <= 'z') ||
            (c >= '0' && c <= '9');
    }
}
