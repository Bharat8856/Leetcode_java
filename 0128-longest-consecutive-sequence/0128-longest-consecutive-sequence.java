class Solution {
    public int longestConsecutive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int x:nums){
        set.add(x);
    }

    int long1=0;

    for(int x:set){
        if(!set.contains(x-1)){
            int curr=x;
            int currl=1;

            while(set.contains(curr+1)){
                curr++;
                currl++;
            }

            long1=Math.max(long1,currl);
        }

    }

    return long1;
        
    }
}