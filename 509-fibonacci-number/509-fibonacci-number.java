class Solution {
    public int fib(int n) {
        // Recursive method
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else{
            return fib(n-1)+fib(n-2);
        }
        
   }
}