    public int[] asteroidCollision(int[] asteroids) {
        int[] ans=new int[asteroids.length];
        if(asteroids.length==0) return ans;
        if(asteroids.length==1) return asteroids;

        Stack<Integer> s=new Stack<>();
        /*After*/
        for(int i=0;i<asteroids.length;i++){
            boolean check=true;
            if(s.isEmpty() || s.peek()*asteroids[i]>0 || s.peek()<0 && asteroids[i]>0){
                s.add(asteroids[i]);
                continue;
            } 
            while(!s.isEmpty() && s.peek()>0 && asteroids[i]<0){
                if( Math.abs(s.peek())==Math.abs(asteroids[i])){
                    s.pop();
                    check=false;
                    break;
                }
                else if( Math.abs(s.peek())<Math.abs(asteroids[i])){
                    s.pop();
                }
                else{
                    check=false;
                    break;
                }
            }
            if(check==true) s.add(asteroids[i]);
        }

        int[] t=new int[s.size()];
        for(int i=0;!s.isEmpty();i++){
            t[i]=s.pop();
        }

        ans=new int[t.length];
        int k=0;
        for(int j=t.length-1;j>=0;j--){
            ans[j]=t[k];
            k++;
        }
        return ans;
    }