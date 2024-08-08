class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        } 
        HashMap<Character, Integer> mp = new HashMap<>();
        int left = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int right = 0; right < s.length(); right++) {
            char currElem = s.charAt(right);
            // currElem window me already present hai left aur right me mid me
            if(mp.containsKey(currElem) && mp.get(currElem) >= left) {
                left = mp.get(currElem) + 1;
            }
            mp.put(currElem, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
