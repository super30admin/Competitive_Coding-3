// space complexity - o(K^2)
    //time - o(K^2)
    //Ran on Leetcode successfully : Yes
    // Problem faced  : No
    //Approach : add 1 in the prev row list if level 0 else two pointer start and end,
    //current element to be added will be sum list.get(start) and list.get(end)

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> prevRow = new ArrayList<>();
        List<Integer> currRow = new ArrayList<>();

        for(int i=0; i<=rowIndex; i++ ){

            if( i == 0){
                currRow.add(1);
            }
            else{
                int start = 0;
                int end = 1;

                currRow.add(prevRow.get(start));

                while(end < prevRow.size()){
                  currRow.add(prevRow.get(start) + prevRow.get(end));
                  start++;
                  end++;
                }

                currRow.add(prevRow.get(start));
            }

            prevRow = currRow;
            currRow = new ArrayList<>();
        }

        return prevRow;

    }
}
