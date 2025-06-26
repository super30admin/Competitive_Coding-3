// TC: O(n)
// SC: O(n)
// n - length of nums

class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(k > 0 && map.containsKey(key+k)){
                cnt++;
            } else if(k == 0 && val > 1){
                cnt++;
            }
        }        
        return cnt;
    }
}


/*

// TC: O(n)
// SC: O(n)
// n - length of nums

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0)return 0;
        int result = 0;
        HashSet<Integer> values = new HashSet<>();
        HashSet<List<Integer>> pairs = new HashSet<>();

        for(int i = 0; i < nums.length;i++){
            int partner_1 = k + nums[i];
            int partner_2 = nums[i] - k;

//            System.out.println("Current num:" + nums[i]);
//            System.out.println("partner_1:" + partner_1);
//            System.out.println("partner_2:" + partner_2);

            if(values.contains(partner_1)){
                //System.out.println("partner_1 found:");
                int[] pair = new int[]{nums[i], partner_1};
                Arrays.sort(pair);
                List<Integer> li = Arrays.asList(pair[0], pair[1]);
                

                if(pairs.contains(li) == false){
                    System.out.println("partner_1 pair does not exists");
                    result++;
                    pairs.add(li);
                }
            }

            if(values.contains(partner_2)){
                //System.out.println("partner_2 found:");
                int[] pair_2 = new int[]{nums[i], partner_2};
                Arrays.sort(pair_2);
                List<Integer> li_2 = Arrays.asList(pair_2[0], pair_2[1]);
                
                if(pairs.contains(li_2) == false){
                    System.out.println("partner_2 pair does not exists");
                    result++;
                    pairs.add(li_2);
                }
            }

            values.add(nums[i]);
        }
        
        
        return result;
        
    }
}

*/



/*

//Brute Force

// TC: O(n^2)
// SC: O(n)
// n - length of nums

class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Set<List<Integer>> s = new HashSet<>();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int a = nums[i];
                int b = nums[j];
                if(Math.abs(a-b) == k){
                    List<Integer> li = new ArrayList<>();
                    if(a > b){
                        li.add(b);
                        li.add(a);
                    } else {
                        li.add(a);
                        li.add(b);
                    }
                    if(!s.contains(li)){
                        s.add(li);
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}

*/