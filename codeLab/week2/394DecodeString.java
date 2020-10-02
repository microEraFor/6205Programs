    public String decodeString(String s) {
        if(s.length()==0) return "";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=']') stack.add(c);
            else{
                String temp="";
                while(!Character.isDigit(stack.peek())){
                    if(Character.isLetter(stack.peek()))  temp+=stack.peek();                 
                    stack.pop();
                }
                String countStr="";
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    countStr=stack.pop()+countStr;
                }
                int count=Integer.parseInt(countStr);
                for(int j=0;j<count;j++){
                    for(int m=temp.length()-1;m>=0;m--)
                        stack.add(temp.charAt(m));
                }
            }
        }
        StringBuffer sb=new StringBuffer();
        int size=stack.size();
        for(int k=0;k<size;k++){
            sb.append(stack.get(k));
        }
        return sb.toString();
    }