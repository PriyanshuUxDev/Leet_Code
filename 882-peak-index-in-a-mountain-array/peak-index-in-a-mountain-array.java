class Solution {
    public int peakIndexInMountainArray(int[] arr) {
           int st=0,end=arr.length-1,mid;
        while(st<=end){
            mid=(end+st)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid-1]<arr[mid]){
                st=mid;
            }
            else{
                end=mid;
            }
            
            
        }
       return -1;
    }
}