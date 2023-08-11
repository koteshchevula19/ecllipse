package pack1;

public class Tables {
	void m1(int n)
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				int result=i*j;
				System.out.println(i+" x "+j+"  = "+result);
				
				
			}
			System.out.println("================");
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tables aobj=new Tables ();
		aobj.m1(15);
		 int y=Math.floorMod(1, 3);
		 System.out.println(y);
		

	}

}
