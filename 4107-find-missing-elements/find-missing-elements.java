class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int min = nums[0];
        int curr=min;
        int max=nums[n-1];
        for(int i=0;i<n;i++){
            if(curr!=nums[i]){
                list.add(curr);
                i--;
            }
                curr++;
        }
        return list;


        
    }
}