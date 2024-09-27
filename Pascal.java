// Time Complexity :O(n2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Pascal {
    public List<List<Integer>> generate(int numRows) {



        List<List<Integer>> matrix=new ArrayList<List<Integer>>();

        if (numRows == 0) {
            return matrix;
        }

        matrix.add(new ArrayList<>());
        matrix.get(0).add(1);


        for(int i=1;i<numRows;i++)
        {
            List<Integer> arr=new ArrayList<>();
            List<Integer> prevRow = matrix.get(i-1);
            arr.add(1);

            for(int j=1;j<i;j++)
            {
                arr.add( prevRow.get(j-1) + prevRow.get(j) );
            }
            arr.add(1);
            matrix.add(arr);

        }

        return matrix;
    }
}