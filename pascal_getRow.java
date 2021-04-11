/*
Run time complexity - O(N2) where N is the rowIndex
Space complexity - There is no additional space used other than the output array.
*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<Integer>(rowIndex+1);
        for(int k=0;k<=rowIndex;k++)
            result.add(0);
        result.set(0,1);
        for(int i=0;i<=rowIndex;i++)
        {
            for(int j=i;j>0;j--)
            {
                result.set(j,result.get(j)+result.get(j-1));
            }
        }
        return result;
    }
}
