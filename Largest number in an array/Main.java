import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
      	arr[i] = in.nextInt();
      }
      larg_arr_num(arr,arr_size);
    }
  public static void larg_arr_num(int arr[],int n)
  {
      int largest = arr[0];
  	  for(int i=0;i<n;i++)
      {
      	if(largest<arr[i])
        {
        	largest = arr[i];
        }
      }
    System.out.println(largest);
  }
}