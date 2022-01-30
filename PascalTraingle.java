class Solution {
    //TC : O(n2)
    //SC : O(1)
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        res.add(list1);
        if(numRows == 1) {
            return res;
        }

        for(int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(list);
        }
        return res;
    }
}