class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows==0) return res;
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,1));
        res.add(l1);
        if(numRows==1){
            return res;
        }
        res.add(l2);
        if(numRows==2) return res;

        for(int i=2;i<numRows;i++){
            List li = new ArrayList<>();
            li.add(1);
            for(int j=1;j<i;j++){
                int sol = res.get(i-1).get(j-1)+res.get(i-1).get(j);
                li.add(sol);
            }
            li.add(1);
            res.add(li);
        }
        return res;
    }
}
