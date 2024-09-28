// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Pair<u,v>{
    u first;
    v second;
    Pair(u first,v second){
        this.first=first;
        this.second=second;
    }
    @Override
public boolean equals(Object o)
{
    if (this == o) {
        return true;
    }

    if (o == null || getClass() != o.getClass()) {
        return false;
    }

    Pair<?, ?> pair = (Pair<?, ?>) o;

    // call `equals()` method of the underlying objects
    if (!first.equals(pair.first)) {
        return false;
    }
    return second.equals(pair.second);
}
    
@Override
// Computes hash code for an object to support hash tables
public int hashCode()
{
    // use hash codes of the underlying objects
    return 31 * first.hashCode() + second.hashCode();
}
// Factory method for creating a typed Pair immutable instance
public static <U, V> Pair <U, V> of(U a, V b)
{
    // calls private constructor
    return new Pair<>(a, b);
}
    
    
}
class Solution {
public int findPairs(int[] nums, int k) {
    int count=0;
    
    
    HashSet<Integer> hash1=new HashSet<>();
    HashSet<Integer> hash3=new HashSet<>();
    HashSet<Pair<Integer,Integer>> hash2=new HashSet<>();
    
    for(int i:nums){
        if(hash1.contains(i)){
            hash3.add(i);
            }
        hash1.add(i);
    }
    if(k==0){
        if(nums.length==hash1.size()){
            return 0;
        }
        else{
            return (hash3.size());
        }
    }
    for(int i:hash1){
        if(hash1.contains(i-k)){
            int temp=i-k;
            int smaller;
            int bigger;
            if(i<temp){
                smaller=i;
                bigger=temp;
                
            }else{
                smaller=temp;
                bigger=i;
                
            }
            if(!hash2.contains(new Pair(smaller,bigger))){
                count++;
                hash2.add(new Pair(smaller,bigger));
            }
        }
        
        
    }
    return count;
    
    
}
}



// pascal triangle
//time:- (n*n)
//space : constant
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }else{
                    int first=res.get(i-1).get(j-1);
                    int second=res.get(i-1).get(j);
                    row.add(first+second);
                }
            }
            res.add(row);
        }
        return res;
        
    }
}