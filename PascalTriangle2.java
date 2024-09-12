class Solution {
    //TC : O(n2)
    //SC : O(n)
    public List<Integer> getRow(int rowIndex) {
        int[] arr = new int[rowIndex+1];
        arr[0] =1;

        for(int i = 0; i < rowIndex; i++) {
            for(int j = i+1; j > 0; j--) {
                arr[j] = arr[j] + arr[j-1];
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}