package pack1;

import java.util.Arrays;

public class Wednesday {
	 public int minEatingSpeed(int[] piles, int h) {
	        int max=0;
	        for(int i:piles)
	        {
	            max+=i;
	            System.out.println("====>"+max);

	        }
	        int avg=max/h;
	        
	        Arrays.sort(piles);
	        Arrays.stream(piles).max().getAsInt();
	        
	        int maxpiles=piles[piles.length-1]; 
	        int ban=0;
	        if(piles.length>1)
	        {
	        for(int i=avg;i<=maxpiles;i++)
	            
	        {  int count=0;
	            ban=i;
	            //System.out.println("====>"+ban);
	             for(int j=0;j<piles.length;j++)
	        {
	            	 //System.out.println("===>"+piles[j]);
	            if(ban>=piles[j])
	            {
	                count++;
	            }
	            else
	            { 
	                if(piles[j]%ban!=0)
	                {   int y=0;
	                     y=piles[j]/ban;
	                    count+=y;
	                    int x=0;
	                    x=piles[j]%ban;
	                   if(x<ban)
	                       count++;
	            
	                }
	                else
	                   
	                {
	                    int z=0;
	                    z=piles[j]/ban;
	                   count+=z;
	                }
	                
	                
	            }
	         }
	             
	            if(count<=h)
	            	break;
	        }
	        return ban;
	        }
	        return 2;
	        
	    
	        
	    }
	 public static void main(String[] args) {
		 Wednesday wobj=new Wednesday();
		 int piles[]= {3,6,7,11};
		 System.out.println(wobj.minEatingSpeed(piles, 8));		 
		 
		
	}

}
