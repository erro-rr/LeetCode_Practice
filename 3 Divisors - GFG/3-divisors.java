//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int q = sc.nextInt();
            ArrayList<Long> query = new ArrayList<>();
            for(int i=0;i<q;i++){
                query.add(sc.nextLong());
            }
            Solution ob = new Solution();
                
            ArrayList<Integer> ans = ob.threeDivisors(query,q);
            for(int cnt : ans) {
                System.out.println(cnt);
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        // code here
        // Sieve Code
        int n=1000001;
        boolean prime[]=new boolean[n];
        Sieve(n,prime);
        
        ArrayList<Integer> al=new ArrayList<>();
        for(int j=0;j<q;j++){
            int ans=0;
            for(int i=2;i<=query.get(j);i++){
             if(prime[i]==false){
                 long curr_no=i*i;
                 if(curr_no<=query.get(j)){
                     ans++;
                 }
                 if(curr_no>query.get(j)){
                     break;
                 }
             }
            }
            al.add(ans);
        }
        return al;
     
    }
     static void Sieve(int n,boolean arr[]){
        // false -prime no
        // true  -Not a prime no
        
        for(int i=2;i*i<=n;i++){
            if(arr[i]==false){
                for(int j=i*i;j<n;j=j+i){
                    arr[j]=true;
                }
            }
        }
     }
}