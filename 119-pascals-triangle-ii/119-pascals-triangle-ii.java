class Solution {
    public List<Integer> getRow(int rowIndex) {
       ArrayList<Integer>result=new ArrayList<>();
        long val=1;// because nc0==1,nCn==1;
        
        for(int i=0;i<=rowIndex;i++){
            result.add((int)val);
            val=val*(rowIndex-i)/(i+1);
        }
        return result;
    }
}