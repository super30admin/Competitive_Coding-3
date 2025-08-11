// This solution uses DP approach to generate the required lists
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList();
        List<Integer> list = new ArrayList();
      // base condition to add just 1
        list.add(1);
        lists.add(list);
      // from row 2 and in every row, we generate the required numbers based on looking up from the previous row or list
        for(int i=1;i<numRows;i++) {
            List<Integer> prevList = lists.get(i-1);
            List<Integer> newList = new ArrayList();
            for(int j=0;j<i+1;j++) {
                if(j==0 || j==i) {
                  // First and last elements are always 1's
                    newList.add(1);
                } else {
                  // number in an index is alway sum of same index and prev index from previous row
                    newList.add(prevList.get(j)+prevList.get(j-1));
                }
            }
            lists.add(newList);
        }
        return lists;
    }
}
