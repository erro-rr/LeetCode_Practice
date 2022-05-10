class Solution {
    public int fib(int n) {
     /*   // Recursive method
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else{
            return fib(n-1)+fib(n-2);
        }  */
        
        
        // Iterative method
        
      
          if(n <= 1)
            return n;
        
		int a = 0, b = 1;
		
		while(n-->1)
		{
			int sum = a + b;
			a = b;
			b = sum;
		}
        return b;
   }
}