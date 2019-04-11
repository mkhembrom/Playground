import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      fun_sum(n);
	}
  	
  	public static int fun_sum(int num)
    {
    	int sum = 0;
      	for(int i=1;i<=num;i++)
        {
          sum = sum + i;
        }
        System.out.println(sum);
        return sum;  
    }
}