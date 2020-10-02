    public Stack<Character> addIntoStack(String str){
        Stack<Character> s=new Stack<>();
        for(char c:str.toCharArray()){
            if(c=='#'){
                if(s.isEmpty()) continue;
                else{
                    s.pop();
                }
            }
            else s.add(c);
        }
        return s;
    }

    public boolean backspaceCompare(String S, String T) {
        if(S.length()==0&&T.length()==0) return true;
        Stack<Character> s1=addIntoStack(S);
        Stack<Character> s2=addIntoStack(T);

        if(s1.size()!=s2.size()) return false;
        else{
            while(!s1.isEmpty()){
                if(s1.peek()!=s2.peek()) return false;
                s1.pop();
                s2.pop();
            }
        }
        return true;       
    }