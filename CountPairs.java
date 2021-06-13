// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
// Create a set to keep a track of all the numbers
// for every number, x, in the set, check if the set contians (x+k) and (x-k) and increment the counter accordingly
// return the result as counter/2 since the counter will have twice the value of the pairs.
public class Main {
    public static void main(String[] args) {
        int[] input = new int[] {-1, -2, -3};
        System.out.println(countPairs(input, 1));
        
    } 
    
    private static int countPairs(int[] arr, int k) {
        if(arr == null || arr.length == 0)
            return 0;
        
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        
        for(int i: set) {
            int n1 = i + k;
            int n2 = i - k;
            if(set.contains(n1))
                result++;
            if(set.contains(n2))
                result++;
        }
        
        return result/2;
    }
}