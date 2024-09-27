/*TC - O (N^2)
 *SC - O(1)
 *Ran on leetcode - yes
 * */

// Approach - add 1 at beginning and end of every sub list , and add two consecutive previous row's numbers and append that to every sublist


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        // Add one mandatorily
        ans.get(0).add(1);

        int k = 1;
        while(k < numRows) {
            System.out.println(k);
            List<Integer> res =  new ArrayList<>();
            res.add(1);

            for (int i = 0 ; i <ans.get(k-1).size() -1 ; i++ ){
                res.add(ans.get(k-1).get(i)+ans.get(k-1).get(i+1));
            }

            res.add(1);
            ans.add(res);
            k++;
            System.out.println(res);
        }

        return ans;
    }
}
