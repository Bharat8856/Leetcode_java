class Solution {
    public int[] maxDepthAfterSplit(String seq) {
      int[] arr = new int[seq.length()];
      int count=0;
      int x=0;
      for(char c:seq.toCharArray()){
            if(c=='('){
                arr[x++]=++count%2;
            }
            else{
                arr[x++]=count--%2;
            }
      }
      return arr;
    }
     
  }