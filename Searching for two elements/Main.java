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
      int search_elem_1 = in.nextInt();
      int search_elem_2 = in.nextInt();
      check(arr,arr_size,search_elem_1);
      check(arr,arr_size,search_elem_2);
    }
  public static void check(int arr[],int n,int elem)
  {
  	  boolean is_bool = false;
      int is_false = -1;
      int this_elem_idx = 0; 
      for(int i=0;i<n;i++)
      {
        	if(elem == arr[i])
            {
                this_elem_idx = i;
            	is_bool = true;
              	break;
            }
      }     
      if(is_bool == true)
      {
      	System.out.println(this_elem_idx);
      }
      else
      {
      	System.out.println(is_false);
      }
  }
}