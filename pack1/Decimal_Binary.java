package pack1;

public class Decimal_Binary {

	public void check()
	// TODO Auto-generated method stub
	{
		String haystack ="but";
		String needle  ="sadButsad";
		int n1=haystack.length();
        int n2=needle.length();
        haystack=haystack.toLowerCase();
        needle=needle.toLowerCase();
        if(n1>=n2)
        	
        { 
        	System.out.println("1....................");
            if(haystack.contains(needle))
            {
            	 System.out.println(haystack.indexOf(needle));
            }
            else
            System.out.println(-1);
            	 

        }
        if(n2>=n1)
        {
        	System.out.println("2.......");
        	if(needle.contains(haystack))
        	{
        		System.out.println(needle.indexOf(haystack));
        	}
        	else
        		System.out.println(-1);
        }
		
	}
        
        
		
		/*String s="Java";
		System.out.println(s.substring(0));
		
		int decimal=15;
		int y=decimal;
		int count=0;
		//int[] arr;
		System.out.println(Math.pow(-2,31)-1);
System.out.println(Integer.MIN_VALUE);
		 
		
		while(true)
		{
			if(decimal==0)
			{
				break;
			}
			else
			{
				 int temp=decimal%2;
				 decimal=decimal/2;
				 count++;
				 System.out.print(temp+" ");
				 
				  
				 
			}
		}System.out.println("\nnumber of bits required to represent "+ y+" is:"+count);*/
		 
		
			
		

	
	public static void main(String[] args) {
		
		Decimal_Binary	a=new Decimal_Binary();
		a.check();
	}
		

	}


