class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length;
        int m=nums2.length;
        int[] arr=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<l && j<m){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k=k+1;
            }
            else{
                arr[k]=nums2[j];
                j=j+1;
                k=k+1;
            }
        }
        while (i < l) { 
            arr[k] = nums1[i]; 
            i++; 
            k++; 
        } 
        while (j < m) { 
            arr[k] = nums2[j]; 
            j++; 
            k++; 
        } 
        if(arr.length%2==0){
             int n1=(arr.length)/2;
             int n2=n1+1;
            double median=(double)(arr[n1-1]+arr[n2-1])/2;
            return median;
        }
        else{
            int n1=arr.length/2;
            double median=arr[n1];
            return median;
            
        }
    }
}
