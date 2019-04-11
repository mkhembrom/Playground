import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int missing_val = 0;
        for(int val=1;val<=n;val++)
        {
            boolean is_found = false;
            for(int i = 0; i <= n - 1; i++){
                if(arr[i] == val)
                {
                    is_found = true;
                    break;
                }
            }
            if(is_found == false){
                missing_val = val;
                break;
            }
        }
        System.out.print(missing_val);
    }
}