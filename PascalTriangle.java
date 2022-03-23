import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(1)
class PascalTriangle{
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList();        
        int row=0;        
        
        while(row < numRows) {
        	int col=0;
        	List<Integer> list= new ArrayList<>();
        	while(col <= row) {
        		if(col ==0 || col==row) {
        			list.add(1);        		
        		}else {
        			int ele= res.get(row-1).get(col-1)+ res.get(row-1).get(col);
        			list.add(ele);        			
        		}
        		col++;
        	} 
        	row++;
        	res.add(list);
        }
        
        return res;
    }
	
	//Driver Code
	public static void main(String[] args) {
		PascalTriangle ob = new PascalTriangle();
		int k= 5;
		System.out.println(k+" row of pascal's traingle: "+ ob.generate(k));
	}
}