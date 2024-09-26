class Solution {
    public List<List<Integer>> generate(int k) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> row = new ArrayList();
        for(int i=0; i<k; i++){
            row.add(0, 1);
            for (int j=1; j< row.size()-1; j++){
                row.set(j, row.get(j) + row.get(j+1));
            }
            result.add(new ArrayList(row));
        }
        return result;
    }
}