
public class ArrayInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 5 ,4 ,6};
		int[] arr2 = new int[arr.length];
		int j=0;
		int n = arr.length;
		for(int i = n-1; i>=0 ; i--)
		{
			arr2[j] = arr[i];
			
			j++;
		}
		
		for(int e : arr2)
		
		System.out.print(" " + e);

	}

}
