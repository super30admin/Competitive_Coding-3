class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        res.add(temp);
        if(numRows==1)
        return res;
        for(int i=1;i<numRows;i++)
        {
            List<Integer> temp1 = new ArrayList<>();
            temp1.add(1);
            for(int j=1;j<i;j++)
            {
                temp1.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            temp1.add(1);
            res.add(temp1);
        }
        return res;
    }
}

//Time Complexity: O(numRows^2)
//Space Complexity: O(numRows^2)