class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int freq[]=new int[nums.length+1];
        for(int x:nums){
            freq[x]++;
        }

        for(int i=1;i<=nums.length;i++){
            if(freq[i]==0){
                list.add(i);
            }
        }
    
    return list;
        
    }
}