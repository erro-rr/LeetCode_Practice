//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int n)
	{
        // code here such that selectionSort() sorts arr[]
          int maxIndex=0;
	     for(int i=1;i<n;i++){
	        if(arr[i]>arr[maxIndex]){
	            maxIndex=i;
	        }
	    }
      return maxIndex;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	  
	      for(int i=0;i<n-1;i++){
           int maxIndex=select(arr,n-i);
            int end=n-i-1;
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[end];
            arr[end]=temp;
            
        }
	}
}