package pack1;

import java.util.Arrays;

public class PatternsAll {
	int a=10,b=20;
	void pattern1(int n)
	{
		for(int row=1;row<=2*n;row++)
		{
			int colval=row>n?2*n-row:row;
			for(int space=1;space<=n-colval;space++)
			{
				System.out.print("  ");
			}
			
			
			for(int col=colval;col>=1;col--)
			{
				System.out.print(col +" ");
			}
			for(int col=2;col<=colval;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
			
		}
		
		
	}
	void pattern2(int n)
	{
		for(int row=1;row<=n;row++)
		{
			for(int space=0;space<n-row;space++)
			{
				System.out.print("    ");
			}
			for(int col=row;col>=1;col--)
			{
				System.out.print(col+"   ");
			}
			for(int col=2;col<=row;col++)
			{
				System.out.print(col+"  "
						+ " ");
			}
			System.out.println();
		}
	}
	void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
}
	static void changearray(int[] nums)
	{ nums[0]=99;
		
		
	}

	public static void main(String[] args) {
		new PatternsAll().pattern1(9);
		new PatternsAll().pattern2(5
				);
		new PatternsAll().swap(10,20);
		int arr[]= {1,2,3,4,5};
		changearray(arr);
		System.out.println(Arrays.toString(arr));
		Object o=new PatternsAll(); 
		

	}

}
