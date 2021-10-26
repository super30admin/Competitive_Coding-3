//Time Complexity: O(N)
//Space Complexity: O(N)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> masterList = new ArrayList<>();



        for(int i = 0; i < numRows; i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j <= i; j++)
            {
                if(j == i || j ==0) list.add(1);

                else
                {
                    list.add(masterList.get(i - 1).get(j - 1) + masterList.get(i - 1).get(j));
                }
            }masterList.add(list);
        }
        return masterList;
    }
}