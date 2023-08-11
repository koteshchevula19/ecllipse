package pack1;

import java.util.Arrays;

public class StringProblem {
	
	
	public int m1(String s)
	{
		int n=s.length();
		int a[]= {2,3,5,7};
		
		int count=0;
		for(int i=0;i<n-3;i++)
		{
			if(s.charAt(i)=='c'&&s.charAt(i+1)=='o'&&(s.charAt(i+2)>='a'&&s.charAt(i+2)<='z')&&s.charAt(i+3)=='e')
			{
				count++;
			}
			
			
			
		}
		return count;
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		System.out.println(new StringProblem().m1("copexxxxxcooe"));
		int a[][]= {{1,2,4},{3,3,1}};
		 System.out.println(a.length);
		 
		 for(int i=0;i<a.length;i++)
		 {
		   Arrays.sort(a[i]);
		 }
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
			 
			 
			 
		 }
		 for(int[] b:a)
		 {
			 System.out.println(b);
			 
		 }
		 //System.out.println(Arrays.toString(a));
		 
		
		 

	}

}
