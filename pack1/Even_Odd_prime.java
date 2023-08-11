package pack1;

public class Even_Odd_prime {
	public boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		 
		for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
			
			
			
			
			
			 
				
			return true;
			
			
		
		
		
		
	}
	
	void m1(String Operator,int n1,int n2)
	{
		switch(Operator)
		{
		case "EVEN":
					if(n1<n2)
						
					{	
						System.out.println(" n2 is greater than n1");
						System.out.println("Printing the even numbers b/w the range"+n1+"-"+n2);
						for(int i=n1;i<=n2;i++)
						{
							if(i%2==0)
							{
								System.out.println(i+"is a even number");
							}
						}
					}
					else
					{
						System.out.println(" n2 is greater than n1");
						System.out.println("Printing the even numbers b/w the range"+n2+"-"+n1);
						for(int i=n2;i<=n1;i++)
						{
							if(i%2==0)
							{
								System.out.println(i+"is a even number");
							}
						}
					}
					break;
		case "ODD":
			if(n1<n2)
				
			{	
				System.out.println(" n2 is greater than n1");
			    System.out.println("Printing odd numbers b/w the range"+n1+"-"+n2);
			     for(int j=n1;j<=n2;j++)
				
			      {
				
				   if(j%2!=0)
				     {
					   System.out.println(j+" is odd number");
				      }
			       }
			}
			else
			{
				System.out.println(" n2 is greater than n1");
				System.out.println("Printing the odd numbers b/w the range"+n2+"-"+n1);
				for(int j=n2;j<=n1;j++)
				{
			
					if(j%2!=0)
				     {
					   System.out.println(j+" is odd number");
				      }
			       }
			}
			break;
			
		case "PRIME":
			if(n1<n2)
				
			{	
				System.out.println(" n2 is greater than n1");
				System.out.println("Printing the Prime numbers b/w the range"+n1+"-"+n2);
				// int p=n1;
				
				 
					for(int i=n1;i<=n2;i++)
						
					{ if(isPrime(i))
					   {
						System.out.println(i);
					   }
						 							 
				 	}
					
					
					
				}
			break;
			
			
					
					
					default:
						System.out.println("Invalid Input");
					
					
						
			
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Even_Odd_prime().m1("PRIME", 4, 20);
		
		}

	}


