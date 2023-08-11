package pack1;

import java.util.Arrays;

//import java.util.Arrays;
//import java.util.stream.IntStream;

public class Pp3 {
	long num5;
	public void smallestNumber(long num) {
        
        if(num<0) 
        {	 
          num5=num*-1;
        	String s2=String.valueOf(num5);
        	System.out.println(s2);
         //String s3=s2.substring(0);
          char c3[]=s2.toCharArray();
          Arrays.sort(c3);
          char first;
          char last;
          for(int i=0;i<s2.length()/2;i++)
          {
        	  first=c3[i];
        	  last=c3[s2.length()-i-1];
        	  c3[i]=last;
        	  c3[s2.length()-i-1]=first;
        	  
        	  
        	  
          }
          for(int i=0;i<s2.length();i++)
          {
        	  System.out.println(c3[i]);
          }
          String s4=new String(c3);
          Long l1=new Long(s4);
          long l3=l1.longValue();
      System.out.println(l3*-1);
  }
       
          
          
          





      
      
      
      
      
      
      
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int num=301;
		 String s=String.valueOf(num);
		// System.out.println(s);
		 char min;
		 char zero;
		 int a[]=new int[s.length()];
		 char c[]=s.toCharArray();
		 Arrays.sort(c);
		 if(c[0]=='0')
		 
		 {
			 min=c[1];
			 zero=c[0];
			 c[0]=min;
			 c[1]=zero;
			 
			 
			 
		 }
		 for(int i=0;i<s.length();i++)
		 {
			  
			 
			 System.out.println(c[i]);
		 }
		 String s1=new String(c);
		 System.out.println(s1);
		 Long l=new Long(s1);
		 System.out.println(l);*/
		 /*int num2=-7650;
		 String s3=String.valueOf(num2);
		 String s4=s3.substring(0,1);
		 char c4[]=s4.toCharArray();
		 System.out.println(c4[0]);
		 char c3[]=s3.toCharArray();
		 Arrays.sort(c3);
		 System.out.println("------");
		 for(int k=1;k<s3.length();k++)
		 {
			 System.out.println(c3[k]);
			 
			 
		 }
		 
		 
		 
		 
			 
			 
			 
			 /*for(int i=0;i<s.length();i++)
		 {
			 for(int j=i+1;j<s.length();j++)
			 {
				 if(c[i]<c[j])
				 {
					 min=c[i];
					 c[i]=c[j];
					 c[j]=min;
					 
					 
				 }
				 
				 
				 
				 
			 }
			 
			 
			 
			 
			 
		 }*/
		/*int num=-7605;
		
		if(num<=0)          
	           
        {
            String s2=String.valueOf(num);
          String s3=s2.substring(1);
          char c3[]=s3.toCharArray();
          Arrays.sort(c3);
          for(int i=0;i<s3.length();i++)
          {
        	  System.out.println(c3[i]);
        	  
          }
          char c4[]=new char[c3.length];
          for(int i=c3.length;i>=0;i--)
          {
        	  int j=0;
        	  c4[j]=c3[i];
        	  
          }
          String s4=new String(c3);
          String s5=new String(c4);
          System.out.println(s5);
          Long l1=new Long(s4);
          System.out.println(l1);
          
        }*/
		/*int num=-7605;
		 if(num<0)   
	            String s2=String.valueOf(num);
	            String s3=s2.substring(0);
	            char c3[]=s2.toCharArray();
	            Arrays.sort(c3);
	            String s4=new String(c3);
	            Long l1=new Long(s4);
	        return l1*(-1);
	    }
	         if(num>0)
	    {
	            
	        String s=String.valueOf(num);
	        //System.out.println(s);
	        char c[]=s.toCharArray();
	        Arrays.sort(c);
	        char min;
	        char zero;
	        if(c[0]!='-'&&c[0]=='0')
	        {
	            zero=c[0];
	            min=c[1];
	            c[0]=min;
	            c[1]=zero;
	        }
	       String s1=new String(c);
	        Long l=new Long(s1);




	                       
	                       




	 
	        
	    return l;
	    }*/
		 new Pp3().smallestNumber(-7605);	
		 int n[][]= {{1,2},{2,3}};
		 int n1[][]= {{3,1},{2,3}};
		 Arrays.sort(n);
		 Arrays.sort(n1);
		 System.out.println(Arrays.toString(n1));

	         
	            
	            
	            





	        
	        
	        
		 
		 
		 
		 }

	}


