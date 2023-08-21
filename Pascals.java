//TC = O(rows*columns)
//SC = O(1)
//// Did this code successfully run on Leetcode :yes
class Pascals{
    public List<List<Integer>> generate(int rows){
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<rows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j<=i; j++){ // 
                if(j==0 || j==i) list.add(1); // As first and last element in each rpw will always be 1.
                else{
                    int left = res.get(i-1).get(j-1);  // Going previous row and elemnt on left.
                    int right = res.get(i-1).get(j); // Going previous row and element on rght.
                    list.add(left+right);
                }
            }
            res.add(list);
        }
        return res;
    }
}