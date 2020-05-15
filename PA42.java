//Time Complexity : O(n^2)
//Space Complexity: O(1) //only auxillary space allocated

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> ls=new ArrayList<>();   
        int nprev=1;
        int oprev=1;
        ls.add(1);
        for(int i=1; i<=rowIndex;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    if(j==i){
                        ls.add(1);
                    }else{
                        ls.set(j,1);
                    }                    
                }
                else{
                    nprev=ls.get(j);
                    ls.set(j,oprev+ls.get(j));
                    oprev= nprev;
                }                
            }
        }
        return ls;
    }
}