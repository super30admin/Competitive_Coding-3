//TC O(n^2)
//SC O(n)
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        if(numRows==1){
            return result;
        }

        for(int i=1;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            List<Integer> prev = result.get(i-1);
            temp.add(1);
            for(int j=1;j<i;j++){

                int val = prev.get(j-1) ==null? 0 : prev.get(j-1);
                int val2 = prev.get(j) ==null? 0 : prev.get(j);
                temp.add(val+val2);
            }
            temp.add(1);
            result.add(temp);

        }

        return result;
    }
}