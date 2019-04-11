import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int i = 0; i <= arr_size - 1; i++){
           arr[i] = in.nextInt();
       }
       int sum = in.nextInt();
       // Function call
       match(arr_size, arr, sum);
    }
    // Perfect couple function definition
    public static void match(int arr_size, int arr[], int sum)
    {
        for(int i = 0; i <= arr_size - 1; i++)
        {
            for(int j = i + 1; j <= arr_size - 1; j++)
            {
                int add = arr[i] + arr[j];
                if(add == sum)
                {
                    System.out.println(arr[i]+","+" "+arr[j]);
                }
            }
        }
    }
}

