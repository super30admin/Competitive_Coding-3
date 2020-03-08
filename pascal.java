//constant space o(n^2) time
//passed all leetcode cases
// using previous arraylist to get present arraylist while returning a list of lists
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pasLists = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return pasLists;
        }
        pasLists.add(new ArrayList<>());
        pasLists.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> present = new ArrayList<>();
            List<Integer> previous = pasLists.get(i-1);
            present.add(1);
            for(int j=1;j<i;j++){
                present.add(previous.get(j-1)+previous.get(j));
            }
            present.add(1);
            pasLists.add(present);
        }
        return pasLists;



    }


}
