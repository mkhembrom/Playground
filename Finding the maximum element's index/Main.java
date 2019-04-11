import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in =  new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i=0;i<n;i++)
    {
    	list[i] = in.nextInt();
    }
    func(list,n);
    
  }
  
  public static void func(int arr[],int n)
  {
    int max = arr[0];
    int idx_elem = 0;
  	for(int i=0;i<n;i++)
    {
    	if(max<arr[i])
        {
        	max = arr[i];
          	idx_elem = i;
        }	
    }
    System.out.println(idx_elem);
    
  }
}