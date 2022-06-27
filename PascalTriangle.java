public class PascalTriangle {
    // TC is O(n^2)
    // SC is O(1)
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] dirs = {{-1,-1},{-1,0}};
        for(int i=0; i< numRows;i++){
            List<Integer> subList = new ArrayList<>();
            for(int j=0; j<=i; j++){
                int subVal = 0;
                for(int[] dir: dirs){
                    int nr = i+dir[0];
                    int nc = j+dir[1];
                    System.out.println("nr "+nr+" nc "+nc);
                    if(nr >= 0 && nc >=0 && nr<=i && nc<i){
                        subVal+=result.get(nr).get(nc);
                    }
                }
                    if(subVal > 1){
                        subList.add(subVal);
                    }else{
                        subList.add(1);
                    }
            }
            result.add(subList);
        }
        return result;
    }
}
