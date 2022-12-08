//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isSumOfTwo(int N){
        // code here
        for(int i=2;i<=N/2;i++){
            if(prime(N-i)&&prime(i)){
            return "Yes";
        }
        }
        return "No";
    }
    static boolean prime(int N){
       if(N<2){
           return false;
       }
       for(int i=2;i<=Math.sqrt(N);i++){
           if(N%i==0){
               return false;
           }
       }
       return true;
    }
}