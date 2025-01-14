class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        for(int i=1; i<numRows; i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> priorList = result.get(i-1);
            list.add(1);
            for(int j=1; j<i; j++){
                list.add(priorList.get(j) + priorList.get(j-1));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}
