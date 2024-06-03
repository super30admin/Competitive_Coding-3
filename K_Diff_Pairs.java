//time complexity:O(n)
//space complexity:O(n)
import java.util.*;
public class K_Diff_Pairs {
        public int findPairs(int[] nums, int k) {
            HashMap<Integer,Integer> map=new HashMap<>();
            int count=0;
            for(int i=0;i<nums.length; i++)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1); //{1, 2}
            }
            for(Integer key: map.keySet())
            {
                int b= k+key;
                if(k>0 && map.containsKey(b))
                {
                    count++;
                }
                else if(k==0 && map.get(b)>1)
                {
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args)
        {
            K_Diff_Pairs d= new K_Diff_Pairs();
            int[] nums={1,3,1,5,4};
            int k=0;
            int c=d.findPairs(nums,k);
            System.out.println(c);
        }
    }

