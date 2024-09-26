public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] temp = new int[numRows];
        for(int i=0; i<numRows; i++){
            List<Integer> li1 = new ArrayList<>();
            
            if(i==0){
                li1.add(1);
            }
            else if(i==1){
                li1.add(1);
                li1.add(1);
                temp[0] = 1;
                temp[1] = 1;
            }
            else{
                for(int j=0; j<=i; j++){
                    if(j==0 || j==i){
                        li1.add(1);
                    }
                    else{
                        li1.add(temp[j]+temp[j-1]);
                    }
                }
                int count =0;
                for(int val:li1){
                    temp[count++] = val;
                }
            }
            ans.add(li1);
        }
        return ans;
    }
}
