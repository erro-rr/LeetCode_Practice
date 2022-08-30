class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        
        if(len1!=len2) return false;
        
        HashMap<Character,Character> map=new HashMap<>();

           for(int i = 0; i<len1; i++){
           char c1 = s.charAt(i);
           char c2 = t.charAt(i);
           if(map.containsKey(c1)){
               if(map.get(c1)!=c2){
                   return false;
               }
           }
           else if(map.containsValue(c2)){
               return false;
           }
            else{
               map.put(c1,c2); 
            }
           }
        return true;
   }
 }