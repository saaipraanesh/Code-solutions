class Solution {
    public int maximumCount(int[] nums) {
       int n = nums.length;
        int posIndex = pos(nums);
        int negIndex = neg(nums);
        
        // If there are only zeros, return 0
        if (posIndex == -1 && negIndex == -1) {
            return 0;
        }
        
        int posCount = (posIndex == -1) ? 0 : n - posIndex;
        int negCount = (negIndex == -1) ? 0 : negIndex + 1;
        
        return Math.max(posCount, negCount);

    }
    public int pos(int[]nums){
        int s=0;
        int e=nums.length-1;
        int pos=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>0){
                pos=mid;
                e=mid-1;
            }
            else
            s=mid+1;

        }
        return pos;
    }
     public int neg(int[]nums){
        int s=0;
        int e=nums.length-1;
        int neg=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<0){
                neg=mid;
                s=mid+1;
            }
            else
            e=mid-1;

        }
        return neg ;
    }
}
