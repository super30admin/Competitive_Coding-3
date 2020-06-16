class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if(numRows == 0 ) return pascal;
        
        //0th row
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        for(int rowNum = 1 ;rowNum <numRows ;rowNum++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = pascal.get(rowNum-1);
        
        row.add(1);
        for(int j = 1;j < rowNum ;j++){
            row.add(prevRow.get(j-1) + prevRow.get(j));
        }
        row.add(1);
        pascal.add(row);
        } return pascal;
    }
    }
	
	/*
	TimeComplexity : O(n*n) 
	SpaceCompelxity:O(n)
	*/