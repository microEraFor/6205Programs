    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        if(nums.length==0) return ans;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            if(i!=nums.length-1){
                for(int j=i+1,k=1;k<nums.length;j++,k++){
                    if(j>nums.length-1){
                        j=0;
                    }
                    if(nums[j]>nums[i]){
                        ans[i]=nums[j];
                        break;
                    }
                }
            }else{
                for(int j=0,k=1;j<nums.length && k<nums.length;j++,k++){
                    if(nums[j]>nums[i]){
                        ans[i]=nums[j];
                        break;
                    }
                }
            }           
            if(ans[i]==nums[i]){
                ans[i]=-1;
            }
        }
        return ans;
    }