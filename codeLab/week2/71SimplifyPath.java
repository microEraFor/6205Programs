    public String simplifyPath(String path) {
        if(path.length()==0) return "/";
        Stack<String> s=new Stack<>();
        /* A */
        String[] str=path.split("/");
        for(int i=0;i<str.length;i++){
            String cur=str[i].trim();
            if(cur==null || cur.equals(".") || cur.length()==0) continue;
            if(cur.equals("..")){
                if(!s.isEmpty()) s.pop();
            }else{
                s.add(cur);
            }
        }
        String ans="";
        while(!s.isEmpty()){
            ans="/"+s.pop()+ans;
        }
        return ans.length()==0?"/":ans;
    }