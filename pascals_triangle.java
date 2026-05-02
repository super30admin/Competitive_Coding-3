class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> nums2= new ArrayList<>();
        nums2.add(1);
        arr.add(nums2);
        for(int i=1;i<numRows;i++){
            List<Integer> nums= arr.get(i-1);
            List<Integer> nums1= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    nums1.add(1);
                }else{
                    int prev = nums.get(j-1);
                    int next = nums.get(j);
                    int sum = prev+next;
                    nums1.add(sum);
                }

            }
            arr.add(nums1);
        }
        return arr;
    }
}