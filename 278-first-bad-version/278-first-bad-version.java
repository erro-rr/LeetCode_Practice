/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int high=n;
        
        while(l<=high){
            int m=l+(high-l)/2;
            if(isBadVersion(m)){
                high=m-1;
            }
            else{
                l=m+1;
            }
   }
        return l;
    }
}