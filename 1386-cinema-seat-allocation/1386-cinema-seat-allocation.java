class Solution {
    public int maxNumberOfFamilies(int n, int[][] rs) {
        Arrays.sort(rs, (a, b) -> Integer.compare(a[0], b[0]));
        int i=0;
        int res=0;
        while(i<rs.length){
            boolean[] arr = new boolean[11];
            int prev=rs[i][0];
            while(i<rs.length && prev==rs[i][0]){
               arr[rs[i][1]]=true;
               i++;
            }
            if(!arr[2]&&!arr[3]&&!arr[4]&&!arr[5]){
                res++;
                arr[5]=true;
            }
            if(!arr[4]&&!arr[5]&&!arr[6]&&!arr[7]){
                res++;
                arr[7]=true;
            }
            if(!arr[6]&&!arr[7]&&!arr[8]&&!arr[9]){
                res++;
            }
            n--;
        }
        return res+n*2;
    }
}