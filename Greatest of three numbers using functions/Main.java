import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      int comp_var = comp(num1,num2);
      int greatestNum = comp(comp_var,num3);
      System.out.println(greatestNum);
	}
  
  public static int comp(int n1,int n2)
  {
    int result;
  	if(n1>n2)
    {
    	result = n1;
    }
    else
    {
    	result = n2;
    }
    return result;
  }
}