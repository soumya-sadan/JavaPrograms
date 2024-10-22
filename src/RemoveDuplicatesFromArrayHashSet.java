import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 1, 2, 22,  4, 2, 3, 5, 6, 22, 67};
		
		 // Use a Set to remove duplicates
		Set<Integer> set = new HashSet<>();
		for(int e : arr)
		{
			set.add(e);
		}
		
		 // Print the Set (which has no duplicates)
		System.out.println("Printing set: " + set);
		
		int[] arr2 = new int[set.size()];
		//convert set to array
		int i=0;
		for(int d : set)
		{
			arr2[i] = d;
			i++;
			
		}
		System.out.print("new array: " );
		for(int d : arr2)
		{
			System.out.print(" " +d);
		}
		
		 
		// Convert Set back to array uisng "toArray"
		Integer[] arr1 = set.toArray(new Integer[0]);
		
		 // Print the array using Arrays.toString()
		System.out.println(Arrays.toString(arr1));
		 
		
		// Alternate approach  print the array element by element
		System.out.println("set to array: ");
		for(int n: arr1)
		{
			System.out.print(" " + n);
		} 
		
	
	}

}
