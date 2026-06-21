class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1l=nums1.length;
        int n2l=nums2.length;
        int n3l=nums1.length+nums2.length;
        int[] nums3=new int[n3l];
        int i=0,j=0,k=0;
        while(i<n1l && j<n2l){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else{
                nums3[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<n1l){
            nums3[k]=nums1[i];
            i++;
            k++;
        }

        while(j<n2l){
            nums3[k]=nums2[j];
            j++;
            k++;
        }

   if(n3l % 2 == 1){
    return nums3[n3l/2];
}
else{
    return (nums3[n3l/2] + nums3[n3l/2 - 1]) / 2.0;
}
    }
}