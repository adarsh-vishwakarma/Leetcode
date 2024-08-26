class Solution {
    public String reverseWords(String s) {
        // remove all the spaces before and after
        s = s.trim();
        // String[] arr = s.split("\\s");
        // List<String> wordList = Arrays.asList(arr);

        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
