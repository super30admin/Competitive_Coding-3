public class Triangle {

    public static List<List<Integer>> triangle(int n) {


        List<List<Integer>> li = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        li.add(list);

        for(int i = 1; i <= n; i++ ){
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            for(int j = 1; j < i; j++){
                int s = li.get(i-1).get(j) + li.get(i-1).get(j-1);
                list2.add(s);
            }
            list2.add(1);
            li.add(list2);
        }
        return li;

    }
}
