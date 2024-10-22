import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayAndSortLinkedHashSet {
	
	public static void main(String[] args)
	{
		
	int[] arr = { 1, 2, 22,  4, 2, 3, 5, 6, 22, 67};
	
	Set<Integer> set = new LinkedHashSet<Integer>();
	for(int e : arr)
	{
		set.add(e);
	}
		
 System.out.println(set);
}

	
}



