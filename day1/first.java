package day1;

import java.util.Arrays;

public class first {
	static int a=30; // static variable
	int b=21;        // instance variable
	static   
	{
		System.out.println("Monday!!!!");
		
		
		
	}
	{
	    System.out.println("yesterday is Sunday");	
		
	}
	public  void xyz()
	{
		int c=10;  // local variable
		System.out.println(c);//10
		System.out.println(b); //  21  1st way
		int ar[]= {1,2,3,4,5,6};
		System.out.println(ar[1]);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		new first().xyz();  //method call
		System.out.println("====> a:"+a);//1st way
		//System.out.println("====> a:"+new first().a);// 2nd way
		System.out.println("====> a: "+first.a);//3rd way
		System.out.println("=====> b: "+new first().b); //2nd 
        int a=10;
        int b=a+++(++a);
        System.out.println(b);
        System.out.println(a);
		

	}
	static
	{
		System.out.println("Tomorrow is Tuesday!!!!");
		
		
		
	}
	{
	    System.out.println("Dayafter tomorrow is Wednesday ");	
		
	}

}
