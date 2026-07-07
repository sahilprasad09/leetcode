class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int i=0,j=0,k=0;
       double median;
       int m=nums1.length;
       int n=nums2.length;
       int new1[]=new int[m+n];
        while(i!=nums1.length&&j!=nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                new1[k++]=nums1[i];
                i++;
            }
            else
            {
                new1[k++]=nums2[j];
                j++;
            }
        }
        while(i < nums1.length) {
            new1[k++] = nums1[i++];
        }

        while(j < nums2.length) {
            new1[k++] = nums2[j++];
        }
        if(new1.length%2==0)
        {
            median=(new1[new1.length/2]+new1[(new1.length/2)-1])/2.0;
        }
        else
        {
            median=new1[(new1.length-1)/2];
        }
        return median;
    }
}