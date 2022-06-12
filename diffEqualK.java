// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Yes was difficult for me to understand

public class Main {
    public static int diff(int[] arr, int k){
        int n = arr.length;
        Arrays.sort(arr);
        int p1 = 0;
        int p2 = 0;
        int count = 0;
        while(p1<n){
            if ((arr[p1] - arr[p2]) == k){
                count++;
                p1++;
                p2++;
            }else if(arr[p1] - arr[p2] > k){
                p2++;
            }else{
                p1++;
            }
        }
        return count++;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arr = {3,1,4,1,5};
        int k = 2;
        int ans = diff(arr,k);
        System.out.println(ans);
    }
}