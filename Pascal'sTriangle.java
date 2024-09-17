//TC: O(n2)
//SC: O(n)
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if(numRows <= 0)
        {
            return result;
        }

        List<Integer> previous = new ArrayList<>();
        previous.add(1);

        result.add(previous);

        for (int i = 2; i <= numRows ; i++)
        {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 0 ; j < previous.size()-1 ; j++)
            {
                current.add(previous.get(j)+previous.get(j+1));
            }
            current.add(1);

            result.add(current);
            previous = current;
        }

        return result;

    }
}