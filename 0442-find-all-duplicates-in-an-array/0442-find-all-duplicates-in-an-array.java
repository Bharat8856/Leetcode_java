class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       List<Integer> list = new ArrayList<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }

       for(int x:map.keySet()){
           if(map.get(x)>=2){
            list.add(x);
           }
       }

       return list;
       
       
    }
}