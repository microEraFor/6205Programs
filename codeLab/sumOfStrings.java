public static String addStrings(String num1, String num2) {
			int add=0;
	        char x='0',y='0';
	        StringBuffer ans=new StringBuffer();
	        for(int i=num1.length()-1,j=num2.length()-1;i>=0 || j>=0;i--,j--){           
	            if(i<0){
	            	x='0';
	            	y=num2.charAt(j);
	            }
	            else if(j<0){
	            	x=num1.charAt(i);
	            	y='0';
	            }
	            else{
	                x=num1.charAt(i);
	                y=num2.charAt(j);
	            }
	            ans.append((x-'0'+y-'0'+add)%10);
	            add=(x-'0'+y-'0'+add)/10;
	        }
	        if(add!=0) ans.append(add);
	        return ans.reverse().toString();
	    }
