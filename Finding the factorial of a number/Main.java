import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int s = fun(n);
    System.out.println(s);
  }
  public static int fun(int x)
  {
  	if(x==0)
    {
    	return 1;
    }
    else
    {
    	return (x * fun(x-1));
    }
  }
}