import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int i = 0; i < arr_size; i++)
        {
            arr[i] = in.nextInt();
        }
        int sum_arr[] = new int[3 * arr_size];
        array_sub(arr_size, arr, sum_arr);
    }
    public static void array_sub(int arr_size, int arr[], int sum_arr[])
    {
        for(int i = 0; i <= arr_size - 1; i++)
        {
            int key =  arr[i];
            for(int j = i+1; j <= arr_size-1; j++)
            {       
                    if(arr[j]>key)
                    System.out.println(key+","+arr[j]+" ");
            }
        }
    }
}