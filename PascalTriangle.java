public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for(int rowNum=1;rowNum<numRows;rowNum++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = result.get(rowNum-1);
            row.add(1);
            for(int j=1;j<rowNum;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}

// TC - O(n2)
// SC - O(n)
