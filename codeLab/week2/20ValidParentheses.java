    public boolean isValid(String s) {
        if(s.length()==0) return true;
        if(s.length()%2!=0) return false;
        Stack<Character> left=new Stack<>();
        /*After*/
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{') left.add(c);
            else{
                if(c==')' && !left.isEmpty() && left.peek()=='(' ) left.pop();
                else if(c==']' && !left.isEmpty() && left.peek()=='[' ) left.pop();
                else if(c=='}' && !left.isEmpty() && left.peek()=='{' ) left.pop();
                else return false;
            }            
        }
        if(!left.isEmpty()) return false;
        return true;
    }