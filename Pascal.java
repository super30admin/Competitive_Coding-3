# Time complexity:O(k)
# Space complexity: 0(k)
# Did code run successfully on leetcode: yes
# Any problem you faced: No



class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<Integer> rowList = new ArrayList<Integer>();
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();

        if(numRows == 0)
            return resultList;

        rowList.add(1);
        resultList.add(rowList);

        for(int i = 1 ; i < numRows; i++){
            ArrayList<Integer> newRowList = new ArrayList<Integer>();
            newRowList.add(1);

            for(int j = 0; j < rowList.size() - 1; j++){
                newRowList.add(rowList.get(j) + rowList.get(j+1));
            }

            newRowList.add(1);
            resultList.add(newRowList);
            rowList = newRowList;

        }


        return resultList;
    }

}