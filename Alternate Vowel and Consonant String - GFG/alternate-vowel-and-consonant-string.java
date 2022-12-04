//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.rearrange(S, N);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String rearrange(String S, int N){
        int[] vow=new int[26];
        int[] cons=new int[26];
        int vc=0;
        int cc=0;
        char smallestvow='u';
        char smallestcons='z';
        for(int i=0;i<N;i++){
           if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u'){
               vow[S.charAt(i)-'a']++;
               vc++;
               smallestvow=(char)Math.min((int)S.charAt(i),(int)smallestvow);
           } 
           else{
               cons[S.charAt(i)-'a']++;
               cc++;
               smallestcons=(char)Math.min((int)S.charAt(i),(int)smallestcons);
           }
        }
        if(Math.abs(vc-cc)>1) return "-1";
        
        boolean isvowel=false;
        if(vc>cc){
            isvowel=true;
        }
        else if(cc>vc){
            isvowel=false;
        }
        else{
            if(smallestvow<smallestcons){
                isvowel=true;
            }
            else{
                isvowel=false;
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(i<26 && j<26){
           if(isvowel){
             while(i<26 && vow[i]==0)i++;
            if(i==26)break;
            sb.append((char)('a'+i));
            vow[i]--;
            isvowel=false;
           }
           else{
            while(j<26 && cons[j]==0)j ++;
            if(j==26)break;
            sb.append((char)('a'+j));
            cons[j]--;
            isvowel=true;
           }
        }
        
        return sb.toString();
    }
}