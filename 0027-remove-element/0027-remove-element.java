class Solution {
    public int removeElement(int[] nums, int val) {
     ArrayList<Integer> list = new ArrayList<>();
     for(int num:nums){
        list.add(num);
     }

     list.removeIf(num->num==val);
     for(int i=0;i<list.size();i++){
        nums[i]=list.get(i);
     }
     return list.size();
    }
}