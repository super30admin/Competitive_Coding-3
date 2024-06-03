//time complexity:O(n)
//space complexity:O(1)
import java.util.*;
public class Pascal {
    public List<Integer> getrow(int row) {
        List<Integer> l = new ArrayList<>();
        int res = 1;
        for (int i = 1; i <= row; i++) {
            l.add(res);
            res = res * (row - i) / i;
        }
        return l;
    }

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for (int row = 1; row <= n; row++) {
            list.add(getrow(row));
        }
        return list;
    }

    public static void main(String[] args) {
        Pascal d = new Pascal();
        List<List<Integer>> ans = new ArrayList<>();
        ans = d.generate(5);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
