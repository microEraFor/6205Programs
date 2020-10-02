    public String removeOuterParentheses(String S) {
        if(S.length()==0) return "";
        StringBuffer ans=new StringBuffer();
        int index=0,end=0;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c=='('){
                s.add(c);
            }else{
                if(c==')'){
                    s.pop();
                }
                if(s.isEmpty()){
                    String t=S.substring(end,i+1);                                     
                    if(t.length()!=2){
                        ans.append(S.substring(end+1,i));
                    }
                    end=i+1;
                }
            }
        }
        return ans.toString();
    }