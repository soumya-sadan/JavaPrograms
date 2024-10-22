import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// Find sum of the array elements
		
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n =s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements  to array:");
		for(int i =0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("Sum : " + sum);

	}

}
