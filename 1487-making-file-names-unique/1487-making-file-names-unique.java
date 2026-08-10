class Solution {
    public String[] getFolderNames(String[] names) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] ans = new String[names.length];
        for(int i=0;i<names.length;i++){
            String name=names[i];
            if(!map.containsKey(name)){
                ans[i]=name;
                map.put(name,1);
            }
            else{
            int k=map.get(name);
             String newString=name +'('+k+')';
             while(map.containsKey(newString)){
                k++;
                newString=name +'('+k+')';
             }
             ans[i]=newString;
             map.put(name,k+1);
             map.put(newString,1);
            }
        }
        return ans;
    }
}