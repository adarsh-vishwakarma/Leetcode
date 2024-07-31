class Solution {

    public static void reverse(char[] str, int i, int j) {
        while(i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = Math.min(k, s.length());
        while(i < s.length()) {
            reverse(str, i, j-1);
            i += 2*k;
            j = Math.min(i+k, s.length());
        }
        return new String(str);
    }
}
