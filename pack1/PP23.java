package pack1;

import java.util.Arrays;

public class PP23 {
	
    public int getMaximumGenerated(int n) {
        
        int nums[]=new int[n+1];
          nums[0]=0;
          nums[1]=1;
        //int max=0;
        
        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
                nums[i]=nums[i/2];
            else
            {
                nums[i]=nums[i-(i/2)]+nums[i/2];
            }

        }
        
        
       // System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
       // System.out.println(Arrays.toString(nums));
        
        /*for(int i=0;i<=n;i++)
        {
            
            if(nums[i]>=max)
                
                max=nums[i];




}
        return max;*/
        
        return nums[n];








        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PP23().getMaximumGenerated(3));
		int a[][]= {{1,2,4},{3,3,1}};
		Arrays.sort(a);
		for(int[] b:a)
			System.out.println(a);
		System.out.println(Arrays.toString(a));
	}

}
