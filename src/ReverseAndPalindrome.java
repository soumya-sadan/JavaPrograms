class ReverseAndPalindrome {
    public boolean isPalindrome(int num) {
        
        int orig = num;
        int digit = 0;
        int reverse = 0;
        while(num!=0 && num>=0)
        {
            digit = num % 10;
            reverse = reverse*10+digit;
            num = num/10;
        }
        System.out.println("Reverse number:" + reverse);
        if(orig==reverse)
        {
          
           return true;
        }
        else if(num<=0)
        {
        	 System.out.println("number is negative");
           
            return false;
        }
        else
        	return false
        
    }

    public static void main(String args[])
    {
    	Palindrome p = new Palindrome();
       if(p.isPalindrome(-121))
       {
    System.out.println("number is palindrome"); 
       }
       else
       {
     System.out.println("number is not a palindrome"); 
       }
        
    }
}