    public int[] dailyTemperatures(int[] T) {
        int[] ans=new int[T.length];
        if(T.length==0) return ans;
        for(int i=0;i<T.length-1;i++){
            int count=0;
            for(int j=i+1;j<T.length;j++){
                if(T[j]>T[i]){
                    count=j-i;
                    break;
                }
            }
            ans[i]=count;
        }
        ans[T.length-1]=0;
        return ans;
    }