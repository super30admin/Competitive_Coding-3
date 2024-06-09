class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> triangle = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        triangle.add(first);
        for(int i = 1; i < numRows; i++){
            List<Integer> previous = triangle.get(i-1);
            List<Integer> current = new ArrayList<>();
            current.add(1); // first column and last column is 1
            for(int j = 1; j < i; j++){
                current.add(previous.get(j) + previous.get(j-1));
            }
            current.add(1);
            triangle.add(current);
        }
        return triangle;

    }
}
