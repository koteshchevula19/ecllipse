package pack1;

import java.util.Arrays;

public class p22 {
	
	
	public int[] m1(String s)
	{
		 int c[]=new int[s.length()];
	        int max=1;
	        for(int i=0;i<s.length();i++)
	        {
	            
	            for(int j=1;j<s.length()-1;j++)
	            {
	                
	                
	                
	                if(s.charAt(i)==s.charAt(j))
	                    
	                    c[i]++;
	                }
	            
	            if(c[i]>=max)
	            {
	            	max=c[i];
	            	
	            	
	            }
	                
	                    

		
		
		
		
	}
	        System.out.println(max);
	        
	       
	        
	        return c;

	}
	
public static void main(String[] args) {
	
	
	System.out.println(Arrays.toString(( new p22().m1("bbbbbbbbbbbb"))));
	
	StringBuilder s=new StringBuilder();
	s.append("abcdefghijklmnopqrstuvwxyzabcdefghij");
	System.out.println(s.capacity());
	System.out.println("-------------");
	s.append("qrst");
	System.out.println(s.capacity());
	System.out.println("----");
	s.append("uvwxyzabcdefhi");
	System.out.println(s.capacity());
	s.append("jkl");
	System.out.println(s.capacity());
	System.out.println("------");
	String a="11";
	int sum=0;
	int i=a.length()-1;
	while(i>=0)
	{
		
	
	if(i>=0)
	{
		sum+=a.charAt(i)-'0';
		System.out.println(sum);
		System.out.println("-----");
		System.out.println(a.charAt(i));
		i--;
	}
	}
	System.out.println(sum);
	String[] str= {"flower","flow","flight","fought"};
	 Arrays.sort(str);
	 for(int j=0;i<str.length;j++)
	 {
		System.out.println(str[j]); 
	 }
	
	
	
}
}

