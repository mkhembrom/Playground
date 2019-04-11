import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int f = 1;
      for(int i = 1;i<=n;i++)
      {
      	f = i * f;
        
      }
      System.out.println(f);
	}
}