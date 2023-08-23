/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Player[]Player=new Player[4];
		for(int i=0;i<4;i++)
		{
		    int id=sc.nextInt();sc.nextLine();
		    String game=sc.nextLine();
		    String level=sc.nextLine();
		    int points=sc.nextInt();sc.nextLine();
		    Player[i]=new Player(id,game,level,points);
		}
		String gn = sc.nextLine();
		String le = sc.nextLine();
		int res=findpoints(Player,le);
		System.out.println(res);
		int res1=findid(Player,gn,le);
		System.out.println(res1);
		
	}
	static int findpoints(Player[]Player,String le)
	{
	    int sum=0;
	    for(int i=0;i<4;i++)
	    {
	        if(gn.equalsIgnoreCase(Player[i].game))
	        {
	            if(Player[i].points>=20)
	            {
	            sum=sum+Player[i].points;
	            }
	            
	        }
	    }
	    if(sum!=0)
	    return sum;
	    else
	    return 0;
	}
	static int findid(Player[]Player,String gn,String le)
	{
	    int iden=0;
	    for(int i=0;i<4;i++)
	    {
	        if(gn.equalsIgnoreCase(Player[i].game))
	        {
	            if(le.equalsIgnoreCase(Player[i].level))
	            {
	                iden=Player[i].id;
	            }
	        }
	    }
	    return iden;
	}
}
class Player
{
    int id;
    String game;
    String level;
    int points;
    public Player(int id,String game,String level,int points)
    {
        this.id=id;
        this.game=game;
        this.level=level;
        this.points=points;
    }
}
