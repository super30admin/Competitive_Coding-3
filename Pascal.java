// Time Complexity : O(nW)
// Space Complexity : O(nW)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class Pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if(numRows == 0){
            return pascal;
        }

        pascal.add(Arrays.asList(1));
        if(numRows == 1){
            return pascal;
        }

        //List<Integer> temp = new ArrayList<>();

        for(int i = 1; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < pascal.get(i - 1).size(); j++){

                //if .get(i -1) is [1]
                if(pascal.get(i - 1).size() == 1){
                    temp.add(pascal.get(i-1).get(0));
                    temp.add(pascal.get(i-1).get(0));
                }
                //if previous array is more than 1
                else if(j == 0 && pascal.get(i - 1).size() > 1){
                    temp.add(pascal.get(i-1).get(0));
                    temp.add(pascal.get(i-1).get(0) + pascal.get(i-1).get(j + 1));
                }
                //if last element
                else if(j == pascal.get(i - 1).size() - 1){
                    temp.add(pascal.get(i-1).get(pascal.get(i-1).size() - 1));
                }
                //everything in btwn
                else{
                    temp.add(pascal.get(i-1).get(j) + pascal.get(i-1).get(j + 1));
                }


            }
            pascal.add(temp);
            //temp = new ArrayList<>();
        }

        return pascal;



    }
}