# Leetcode Problem #4

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] sortedArr = new int[n];
        int i1=0, i2=0;
        float ans;
        for(int i=0; i<n; i++){
            if(i1 >= nums1.length){
                sortedArr[i] = nums2[i2++];
                continue;
            }
            if(i2 >= nums2.length){
                sortedArr[i] = nums1[i1++];
                continue;
            }
            if(nums1[i1] < nums2[i2]){
                sortedArr[i] = nums1[i1++];
            } else {
                sortedArr[i] = nums2[i2++];
            }
        }
        if(n%2==0){
            ans = (sortedArr[n/2] + sortedArr[(n/2) - 1]) / 2F;
        } else{
            ans = sortedArr[n/2];
        }
        return ans;
    }
}
