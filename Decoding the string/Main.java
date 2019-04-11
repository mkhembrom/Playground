import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder ms = new StringBuilder(str); 
    int key = in.nextInt();
    int ms_len = ms.length();
    for(int i = 0; i <= ms_len - 1; i++)
    {
        char ch = ms.charAt(i);
        if(ch >= 'A' && ch <= 'Z')
        {
            ch = (char)(ch - key);
            if(ch < 'A')
            {
                ch = (char)(ch + 26);
            }
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - key);
            if(ch < 'a')
            {
                ch = (char)(ch + 26);
            }
        }
         ms.setCharAt(i,ch);
    }
    System.out.print(ms);
  }
}