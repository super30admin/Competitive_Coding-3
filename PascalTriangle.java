class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        if(n == 0) {
            return res;
        }
        int i, j;
        i = 0;
        while(i < n) {
            List<Integer> row = new ArrayList<>();
            if(i == 0) {
                row.add(1);
            } else {
                List<Integer> prevRow = res.get(i - 1);
                for(j = 0; j < i + 1; j++) {
                    if(j == 0 || j == i) {
                        row.add(1);
                    } else {
                        row.add(prevRow.get(j - 1) + prevRow.get(j));
                    }
                }
            }
            res.add(row);
            i++;
        }
        return res;
    }
}