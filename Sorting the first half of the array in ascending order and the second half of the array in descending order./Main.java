import java.util.Scanner;
class Main
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int list[] = new int[n];
         for(int i = 0;i < n; i++)
         {
             list[i] = sc.nextInt();   
         }
         insertion(n,list);
     }
    public static void insertion(int n,int list[])
    {
        for (int i = 1; i < n/2; i++) 
        {
            int key = list[i];
            int j = i - 1;
            while((j >= 0) && (list[j] > key)) 
            {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        for (int i = n/2; i < n; i++) 
        {
            int key = list[i];
            int j = i - 1;
            while((j >= n/2) && (list[j] < key)) 
            {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(list[i]+" ");
        }
        
    }
}