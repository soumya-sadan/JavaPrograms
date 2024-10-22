import java.util.Arrays;

public class ArrayProgram {

	public static void main(String[] args) {
		
	//Write a Java program to find the largest and second-largest  
	//elements in an array, along with their respective indices
		
		//int[] array = new int[5];
		int [] array = { 23, 45 , 47, 47 };
		int largest = array[0];
		int second = array[0];
		int largeindex = -1;
		int secondindex = -1;
		System.out.println(Arrays.toString(array));
		
		for(int i = 1; i<array.length; i++)
		{		
			System.out.println("====ITERATION" + i + "====");
				if(array[i] > largest)
				{
					second = largest;
					secondindex = largeindex;
					largest = array[i];
					largeindex = i;
					System.out.println("Second: " + second + " sec index : " + secondindex + " largest : " + largest + " largest index : " + largeindex);
				}
				else if (array[i] > second && array[i] != largest)
				{
					second = array[i];
					secondindex = i;
					
				}
			
		}
		
		System.out.println(" Largest number is : " + largest + " with index : " + largeindex);
		System.out.println(" Second Largest number is : " + second + " with index : " + secondindex);
		
	}

}
