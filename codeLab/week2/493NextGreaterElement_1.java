    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        if(nums1.length==0 || nums2.length==0) return ans;       
        for(int i=0;i<nums1.length;i++){
            int t=nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==t){
                    if(j==nums2.length-1){
                        ans[i]=-1;
                    }
                    else{
                        for(int k=j+1;k<nums2.length;k++){
                            if(nums2[k]>nums2[j]){
                                ans[i]=nums2[k];
                                break;
                            } 
                            else ans[i]=-1;
                            
                        }
                    }
                }
            }
        }
        return ans;
    }