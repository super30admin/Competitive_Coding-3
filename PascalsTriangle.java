/*Time complexity: O(k*k)
Space complexity: O(k*k)

1. Initiate the first two rows values as they are standard.
2. Make a generalised for loop starting from numRows>=3
3. Iterate till you finish k passes.
*/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li;
        if(numRows == 0){
            return list;
        }
        
        for( int c =1; c < numRows+1; c ++){
            if(c == 1){
                li = new ArrayList<>();
                li.add(1);
                list.add(li);            
            }
            if(c == 2){
                li = new ArrayList<>();
                li.add(1);
                li.add(1);
                list.add(li);
                System.out.println(list);

            }
            if(c >= 3){
                li = new ArrayList<>();
                li.add(1);
                List<Integer> previous = list.get(c-2);
                int length = previous.size();
                for(int i = 0; i < length-1; i++){
                    li.add(previous.get(i) + previous.get(i+1));
                }

                li.add(1);
                list.add(li);

            }
        }
        return list;
    }
}