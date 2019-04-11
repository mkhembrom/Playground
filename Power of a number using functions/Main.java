import java.util.Scanner;
class Main
{
	public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int m = in.nextInt();
      	fun_pow(n,m);
    }
  
  	public static int fun_pow(int x,int y)
    {
      	int sum = 1;
    	for(int i=1;i<=y;i++)
        {
        	sum = sum * x; 
        }
      	System.out.println(sum);
      	return sum;
    }
}