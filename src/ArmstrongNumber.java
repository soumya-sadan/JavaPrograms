import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
				
		//An Armstrong number is a number that is equal to the sum of 
		//its digits each raised to the power of the number of digits in the number.
		// 153 is an Armstrong number because: 	(1 ^ 3) + (5 ^ 3 ) + (3 ^ 3) = 153 			
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = s.nextInt();
		
		int originalNum = num;
		int sum = 0;
		int digitCount = String.valueOf(num).length();
		System.out.println("Digitcount : " + digitCount);
		
		while(num>0)
		{
			int digit = num%10; //153 => 3
			System.out.println("digit = num%10: >> " + digit);
			sum = (int) (sum + Math.pow(digit, digitCount)); // 3 ^ 3 = 9
			System.out.println("sum = sum + Math.pow(digit, digitCount) : >>" + sum);
			num = num/10;
			System.out.println("num = num/10 : >>" + num);
			System.out.println("-------------");
			
		}
		if (sum == originalNum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}

		s.close();
	}
	
	

}
