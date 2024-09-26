// space complexity - o(K^2)
    //time - o(K^2)
    //Ran on Leetcode successfully : Yes
    // Problem faced  : No
    //Approach : add 1 in the prev row list if level 0 else two pointer start and end,
    //current element to be added will be sum list.get(start) and list.get(end)


class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> temp = new ArrayList<>();

            if(i == 0){
                temp.add(1);
            }
            else{
                int start = 0;
                int end = 1;
                int sum = res.get(i-1).get(0);
                temp.add(sum);

                while(end < res.get(i-1).size()){
                    sum = res.get(i-1).get(end) + res.get(i-1).get(start) ;
                    temp.add(sum);
                    end++;
                    start++;
                }
                temp.add(res.get(i-1).get(--end));
            }
             res.add(temp);
        }
        return res;
    }
}
