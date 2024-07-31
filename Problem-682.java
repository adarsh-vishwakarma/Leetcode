class Solution {
    public int calPoints(String[] operations) {
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        for (String op : operations) {
            if (op.equals("C")) {
                ans.remove(ans.size() - 1);
            } else if (op.equals("D")) {
                int temp = 2 * ans.get(ans.size() - 1);
                ans.add(temp);
            } else if (op.equals("+")) {
                int temp = ans.get(ans.size() - 1) + ans.get(ans.size() - 2);
                ans.add(temp);
            } else {
                ans.add(Integer.parseInt(op));
            }
        }
        for (int num : ans) {
            sum += num;
        }
        return sum;
    }
}
