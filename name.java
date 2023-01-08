	    String query="1326#";
	    /*
	    1-9     a-i
	    10#-26# j-z---
	    */
	    char[] arr=new char[27];
	    char c='a';
	    for(int i=1;i<arr.length;i++)
	    {
	        arr[i]=c;
	        c++;
	    }
	    int i=0;
	    String ans="";
	    while(i<query.length())
	    {
	        char ch=query.charAt(i);
	        if(i+2 < query.length() && query.charAt(i+2)=='#')
	        {
	            String mini=query.substring(i,i+2);
	            ans=ans+arr[Integer.valueOf(mini)];
	            i=i+3;
	        }
	        else
	        {

	                ans=ans+arr[Integer.valueOf(ch-'0')];
	                i++;
	        }
	    }
	    System.out.println(ans);
