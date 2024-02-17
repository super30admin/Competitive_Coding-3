import java.util.List;
import java.util.*;
public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list1 = new ArrayList<Integer>();
            list1.add(1);
            output.add(list1);
            
        for(int i=1;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
        for(int j=1;j<i;j++){
            List<Integer> previous_list = output.get(i-1);
            list.add(previous_list.get(j-1)+previous_list.get(j));         
        }
         list.add(1);
         output.add(list);
    }
    return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> output = generate(5);
		for(List<Integer> l:output)
			System.out.println(l);
	}

}
