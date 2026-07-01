class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            String temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }

        return String.join(" ",arr);
    }
}