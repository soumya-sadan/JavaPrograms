import java.util.Arrays;

public class ArayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		// APPROACH 1
		int[] arr = {3, 5 ,-3456 ,6, 100, 0, 66, 1234 };
	
	/*	int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int e : arr)
			
		{
			if(e > max)
				
			{ max = e;
			
			}
			
			if(e < min)
			{
				min = e;
			}
		}
			//System.out.println(" Min is " + min );
			//System.out.println(" Max is " + max ); 
			 
			 */
			 
			// APPROACH 2
			
			Arrays.sort(arr);
			System.out.println(" Min is " + arr[0] );
			System.out.println(" Max is " + arr[arr.length-1] );
			
		}
				
	}


