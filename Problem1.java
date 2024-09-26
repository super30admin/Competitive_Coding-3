import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Pascal's Triangle
time: O(nxn)
space: O(1)
 */
public class Problem1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows==1){return list;
        }
        list.add(new ArrayList<Integer>(Arrays.asList(1,1)));
        if(numRows==2){return list;
        }

        for(int i=2;i<numRows;i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            List<Integer> prev = list.get(i-1);
            for(int j=1;j<=i/2;j++) {
                temp.add(prev.get(j)+prev.get(j-1));
            }
            int k;
            if((i+1)%2==0) {
                k=(i/2);
            }
            else{
                k = (i/2)-1;
            }
            while(k>=0) {
                temp.add(temp.get(k));
                k--;
            }
            list.add(temp);
        }

        return list;

    }
}
