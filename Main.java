import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String [] arr=name.split("");
        int len=name.length();
        for(int i=0;i<len;i=i+2)
        {
            System.out.print(arr[i]);
        }
    }
}