//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    static String BalancedString(int N) {

     

     int temp=N;

     String lett="abcdefghijklmnopqrstuvwxyz";

     StringBuilder sb=new StringBuilder("");

     

     while(N>26)

     {

         sb.append(lett);

         N-=26;

     }

     

     if((temp&1)==0)

     {

         makeString(sb,N/2,false);

         makeString(sb,N/2,true); //printing reverse

     }

     else

     {

         int sum=sumOfDigits(temp);

         

         if((sum&1)==0)

         {

             makeString(sb,(N+1)/2,false);

             makeString(sb,(N-1)/2,true);

         }

         else

         {

             makeString(sb,(N-1)/2,false);

             makeString(sb,(N+1)/2,true);

         }

     }

     return sb.toString();

     

     

    }

    public static int sumOfDigits(int n)

    {

        int sum=0;

        

        while(n>0)

        {

            int rem=n%10;

            sum+=rem;

            n=n/10;

        }

        return sum;

    }

    

    public static void makeString(StringBuilder sb,int n,boolean reverse)

    {

        int asci=0;

        

        if(!reverse)

        asci=0;

        else

        asci=26-n;

        

        while(n>0)

        {

            char ch=(char)((asci%26)+97);

            sb.append(ch);

            asci++;

            n--;

        }

        

    }

    

}