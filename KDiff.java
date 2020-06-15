//Time Complexity for the bruteforce solution is O(n*n) and space complexity is O(n)
//Bruteforce solution
class Solution {
   public int findPairs(int[] nums, int k) {
       if(nums.length == 0)
           return 0;
       Set<Integer> s = new HashSet<>();
       int count = 0;
       for(int i=0;i<nums.length;i++){
           s.add(nums[i]);
           for(int j=i;j<nums.length;j++){
               if(!s.contains(nums[j]) && Math.abs(nums[i]-nums[j]) == k){
                   count++;
                   s.add(nums[j]);
               }
           }
       }
       return count;
   }
}

////Time Complexity for the optimal solution is O(n log n) and space complexity is O(1)
// Optimal Solution
class Solution {
  public int findPairs(int[] nums, int k) {
    if (nums.length == 0 || k < 0) return 0;
    Arrays.sort(nums);
    int pairs = 0;
    int index = 0;
    if (binarySearch(nums, 1, nums.length - 1, nums[0] + k) != -1) {
      pairs++;
    }

    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] != nums[i] && binarySearch(nums, i + 1, nums.length - 1, nums[i] + k) != -1) {
        pairs++;
      }
    }

    return pairs;
  }

  int binarySearch(int arr[], int l, int r, int x) {
    if (r >= l) {
      int mid = l + (r - l) / 2;
      if (arr[mid] == x)
        return mid;
      if (arr[mid] > x)
        return binarySearch(arr, l, mid - 1, x);
      return binarySearch(arr, mid + 1, r, x);
    }
    return -1;
  }
}