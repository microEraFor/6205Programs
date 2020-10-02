    public int minAddToMakeValid(String S) {
        if(S.length()==0) return 0;
        Stack<Character> s=new Stack<>();
        for(char c:S.toCharArray()){
            if(c=='(') s.add(c);
            else if(c==')'){
                if(s.size()==0) s.add(c);
                else if(s.peek()=='(') s.pop();
                else s.add(c);
            }
        } 
        return s.size();
    }