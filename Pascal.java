/*

    Time Complexity : O(n*(n+1)/2) (Sum of natuaral numbers )
    Space Complexity : O(N) N = total number of elements in Pascal tri
    worked on leetcode : YES
*/

public class Pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer> > res= new ArrayList<>();
        if(numRows<=0){
            return new ArrayList<>();
        }
        for(int i=0;i < numRows;i++){
            
            List<Integer> list =  new ArrayList<>();
            for( int j=0;j < i +1;j++){
                if( j == 0 || j == i){
                    list.add(1);
                }else{
                   list.add(res.get(i-1).get(j-1)+ res.get(i-1).get(j));  
                }
            }
            res.add(list);
        }
        return res;
        
    }
}