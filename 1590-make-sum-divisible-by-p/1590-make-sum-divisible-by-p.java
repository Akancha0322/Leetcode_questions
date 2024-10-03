class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int totalSum = 0;

        for(int i=0; i<n; i++){
            totalSum = (totalSum + nums[i]) % p; 
        }
         
        int target = totalSum % p;
        if(target == 0){
            return 0;
        }

        HashMap<Integer,Integer> remMap = new HashMap<>();
        remMap.put(0,-1);
        int currSum = 0;
        int minLen = n;

        for(int i=0; i<n; i++){
            currSum = (currSum + nums[i]) % p;
            int needed = (currSum - target + p) % p;
            if(remMap.containsKey(needed)){
               minLen = Math.min(minLen, i- remMap.get(needed));
            }
            remMap.put(currSum , i);
        }

        return minLen == n ? -1 : minLen;

    }
}