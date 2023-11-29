class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows == 1) return list;

        for(int i=2; i<= numRows; i++){
            list.add(new ArrayList<>());
            for(int j=0; j<i; j++){
                if(j==0 || j == i-1){
                    list.get(i-1).add(1);
                }else{
                    list.get(i-1).add(list.get(i-2).get(j-1) + (list.get(i-2).get(j)));
                }
            }
        }
        return list;
    }
}