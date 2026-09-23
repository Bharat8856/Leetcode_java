class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] count1= new int[26];
        int[] count2= new int[26];
        int k = p.length();

        if(s.length()<p.length()){
            return list;
        }

        for(char c:p.toCharArray()){
            count1[c-'a']++;
        }

        for(int i=0;i<k;i++){
            count2[s.charAt(i)-'a']++;
        }

            if(Arrays.equals(count1,count2)){
                list.add(0);
            }

        for(int i=k;i<s.length();i++){
            count2[s.charAt(i-k)-'a']--;
            count2[s.charAt(i)-'a']++;

             if(Arrays.equals(count1,count2)){
                list.add(i-k+1);
            }
        }
        return list;
    }
}