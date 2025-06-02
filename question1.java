//time complexity:O(n)
//space complexity:O(n)
class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> answer = new HashSet<>();
        Set<String> pairs = new HashSet<>();
        for (int num : nums) {
            if (answer.contains(num - k)) {
                int a = num - k;
                int b = num;
                int small = Math.min(a, b);
                int large = Math.max(a, b);
                pairs.add(small + "," + large);
            }
            if (answer.contains(num + k)) {
                int a = num;
                int b = num + k;
                int small = Math.min(a, b);
                int large = Math.max(a, b);
                pairs.add(small + "," + large);
            }
            answer.add(num);
        }
        return pairs.size();
    }
}