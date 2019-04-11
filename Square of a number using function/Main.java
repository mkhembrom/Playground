import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      fun(n);
      
	} 
  
  	public static int fun(int m)
    {
    	int sum;
      	sum = m * m;
      	System.out.println(sum);
      	return sum;
    }
}