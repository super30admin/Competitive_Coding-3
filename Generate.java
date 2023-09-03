//Time complexity : o(n) 
//space Complexity : o(1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li =new ArrayList<>();
        li.add(Arrays.asList(1));
        if(numRows==1) return li;
        li.add(Arrays.asList(1,1));


        for(int i=2;i<numRows;i++){
            List<Integer> c = new ArrayList<>();
            c.add(1);
            for(int j=0; j<i-1;j++){
               c.add(li.get(i-1).get(j)+li.get(i-1).get(j+1));
            }
            c.add(1);
            li.add(c);
        }
        return li;
    }
}
