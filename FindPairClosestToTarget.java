// Time Complexity - O(m+n) where m is length of first array and n is length of 2nd array
// Space Complexity - O(1) as we're not using any extra space here

// Reference - https://www.geeksforgeeks.org/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/

public class FindPairClosestToTarget {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1,4,5,7};
        int[] arr2 = new int[]{10,20,30,40};
        int target = 32;

        int p1 = 0;
        int p2 = arr2.length-1;
        int sum =0, minDiff = Integer.MAX_VALUE, diff = 0;
        int res1=0,res2=0;

        while(p1 < arr1.length && p2 >= 0) {
            sum = arr1[p1] + arr2[p2];
            diff = Math.abs(sum-target);
            if(diff<minDiff){
                res1=arr1[p1];
                res2=arr2[p2];
                minDiff = diff;
            }
            if(sum<target){
                p1++;
            }
            else{
                p2--;
            }
        }

        System.out.println(res1+ "," + res2);
    }
}
