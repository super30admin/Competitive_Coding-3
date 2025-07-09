// We show the pascal's for the given n:
// In this solution we have two loops one inside the other so TC: O(n2)
// We also use a inner list however, it is part of the final result so SC: O(1)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Base Case
        if(numRows == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        int counter = 1;
        while(counter<=numRows){
            List<Integer> r = new ArrayList<>();
           // For the first row its only 1
            if(counter == 1){
                r.add(1);
                result.add(r);
                counter = counter + 1;
            }
           // For second row it is always 1 1
            else if(counter == 2){
                r.add(1);
                r.add(1);
                result.add(r);
                counter = counter + 1;
            }
            // from third row onwards, it is 1 on each ends and middle elements are sum of the elements
            else{
                List<Integer> previousList = result.get(counter-2);
                r.add(1);
                System.out.println(counter);
                System.out.println(previousList.toString());
                for(int i=0;i<previousList.size()-1;i++){
                    r.add(previousList.get(i) + previousList.get(i+1));
                }
                r.add(1);
                result.add(r);
                counter = counter + 1;
            }
        }
        return result;
    }
}
