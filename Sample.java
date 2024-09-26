//Your code here along with comments explaining your approach

//add all elements to a hashmap ,calculate frequency and check:
//if k=1 then check for frequency > 2 else if element + k exists in map and count
//O(N),O(N)

Q1:K different pair

public int findPairs(int[] nums, int k) {
    if (nums == null || nums.length == 0 || k < 0)   return 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    int count=0;
    for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
    if(k==0){
        if(entry.getValue() >=2){
           count++;
        }
        
    }else{
        if(map.containsKey(entry.getKey()+k)){
            count++;
        }
    }
}
  return count;  
}
}


//Pascals's triangle

//logic: for k=3 , first and last element will be 1 but rest of the elemnt will be sum of above and above+left/diagonal element
//O(col*row) , O(N)

public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> output= new ArrayList<List<Integer>>();

for(int i=0;i<numRows;i++){ 
    List<Integer> currentList = new ArrayList<>();
        for(int j=0;j<i+1;j++){
           e if(j==0 || j== i){
                currentList.add(1);
            }
            else{
                currentList.add(output.get(i-1).get(j-1)+output.get(i-1).get(j));                   }
        }
        output.add(currentList);
   }
return output;
}



