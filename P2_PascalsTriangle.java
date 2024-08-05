// Time Complexity :O(n2)
// Space Complexity : O(n2)
// Did this code successfully run on Leetcode :yes

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int i,j;
        for(i = 1; i <= numRows; i++) {
            System.out.println(i);
            List<Integer> new_list = new ArrayList<>();
            new_list.add(1);
            if(i == 1){
                list.add(new_list);
                continue;
            } else {
                int ans = 1;
                for(j = 1 ; j < i; j++) {
                    System.out.println(j);
                    ans *= (i - j);
                    ans /= j;
                    new_list.add(ans);
                }
                list.add(new_list);

            }
            System.out.println(new_list);
        }
        return list;
    }
}