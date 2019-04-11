import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = 1;
      for(int count = 1;count<=2*n;count = count + 1)
      {
        if(temp%2==1)
        {
          System.out.println(temp);
        }
        temp = temp + 1;
      }
	}
}