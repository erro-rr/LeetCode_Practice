class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
      int mid=start+(end-start)/2;
          if(arr[mid]>arr[mid+1]){
              end=mid;
    //this is the descending part this may be the ans but to be more precise we have to check left       side this why end!=mid-1
              
          }
            else{
                //this is the aseceding part of the array
                start=mid+1;
                //because know that mid+1 elements is greater than mid eleme hence we are ignoring                    mid element
            }
   
        }
         return start;// or return end
        // because in the end start and end pointer will be points at only one elements which peak elements .start and end always max elements in the their checks
    }
}
