package pack1;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   and 42   ";
		s=s.trim();
		char[] c=s.toCharArray();
		char[] a =new char[s.length()];
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A'&&c[i]<='Z')
			{
				System.out.println(0);
				break;
			}
			if(!Character.isDigit(c[i]))
			{
				System.out.println(0);
				break;
			}
		    else
		    	{
		    	  a[i]=c[i];
		    	  count++;
		    	}
				
			
			
			
			
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(a[count]);
		}
		/*for(int i=0;i<c.length;i++)
			
			if(c[i]=='-'||c[i]=='+')
			{
				
			}//
		 
		System.out.println(s);*/
		
		
		

	}

}
