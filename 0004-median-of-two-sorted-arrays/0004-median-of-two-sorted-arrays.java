class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int low=0;
        int high=n-1;
        int low2=0;
        int high2=m-1;
        int i=0;
        int arr[] =new int[m+n+1];
        while(low<=high && low2<=high2){
            if(nums1[low]<nums2[low2]){
                arr[i++]=nums1[low++];
            }else arr[i++]=nums2[low2++];
        }
        while(low<=high){
            arr[i++]=nums1[low++];
        }
        while(low2<=high2){
            arr[i++]=nums2[low2++];
        }
        if((n+m)%2==0){
            int mid=(m+n)/2;
            float midd=(float)(arr[mid]+(arr[mid-1]))/2;
            return midd;
        }else{
            int mid =(n+m)/2;
            return arr[mid];
        }
  

    }
}