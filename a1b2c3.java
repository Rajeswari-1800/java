/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String [] arr=str.split("");
	    int num;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(Character.isDigit(str.charAt(i)))
	        {
	            num=str.charAt(i)-48;
	            for(int j=0;j<num;j++)
	            {
	                System.out.print(arr[i-1]);
	            }
	            
	        }
	        
	    }
	//	System.out.println("Hello World");
	}
	
}
