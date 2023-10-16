import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AsyncBoxView.ChildLocator;

//Space Complexity : O(1) no additional auxilary space except the output
//Time Complexity : O(n^2)
class PascalTriangle
{
    public static void main(String[] args) 
    {
    List<List<Integer>> mainlist = new ArrayList<List<Integer>>();
	List<Integer> childList = new ArrayList<>();
	   
	int n = 8;
	
    childList.add(1);
	mainlist.add(childList);
	   
	   for(int i = 1; i <n; i++)
	   {
	       List<Integer> forLoopChildList = new ArrayList<>();
	       forLoopChildList.add(1);
	       
	       List<Integer> prevList = mainlist.get(i-1);
	       
	       for(int j=1; j<prevList.size(); j++)
	       {
	           forLoopChildList.add(prevList.get(j-1) + prevList.get(j));
	       }
	       
	       forLoopChildList.add(1);
	       mainlist.add(forLoopChildList);
	   }

       System.out.println(mainlist);
}}