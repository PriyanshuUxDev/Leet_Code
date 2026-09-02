class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n=nums.length;
        
      Map<Integer,Integer> mpp=new HashMap<>();

      for(int i=0;i<n;i++){
        int look=t-nums[i];
        if(mpp.containsKey(look)){
            return new int[] {i,mpp.get(look)};
        }
       mpp.put(nums[i],i);

      }
      return new int[] {-1,-1};
    }
}