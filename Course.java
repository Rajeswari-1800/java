import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    Course[] Course = new Course[4];
	    for(int i=0;i<4;i++)
	    {
	       int courseid=sc.nextInt();sc.nextLine();
	       String coursename=sc.nextLine();
	       String courseadmin=sc.nextLine();
	       int quiz=sc.nextInt();sc.nextLine();
	       int handson=sc.nextInt();sc.nextLine();
	       
	       Course[i]=new Course(courseid,coursename,courseadmin,quiz,handson);
	    }
	    String name=sc.nextLine();
	    int hands=sc.nextInt();
	    int res=findAvgOfQuizByAdmin(Course,name);
	    if(res!=0)
	    {
	        System.out.println(res);
	    }
	    else
	    {
	        System.out.println("No Course found");
	    }
	    Course[] result=sortCourseByHandsOn(Course,hands);
		if(result!=null)
		{
		    for(int i=0;i<result.length;i++)
		    {
		        System.out.println(Course[i].coursename);
		        
		    }
		}
		else
		System.out.println("No Course found with mentioned attributes.");
	}
	public static int findAvgOfQuizByAdmin(Course[] Course,String name)
	{
	    int sum=0;
	    int count=0;
	    for(int i=0;i<4;i++)
	    {
	        if(name.equalsIgnoreCase(Course[i].courseadmin))
	        {
	          sum=sum+Course[i].quiz;  
	          count++;
	        }
	       
	    }
	    if(count==0)
	    {
	        return 0;
	    }
	    else
	    return sum/count;
	}
	public static Course[] sortCourseByHandsOn(Course[] Course,int hands)
	{
	    Course[] obj=new Course[0];
	    Course val;
	    for(int i=0;i<4;i++)
	    {
	        if(hands>(Course[i].handson))
	    {
	        obj=Arrays.copyOf(obj,obj.length+1);
	        obj[obj.length-1]=Course[i];
	    }
	    }
	    
	    for(int i=0;i<4;i++)
	    {
	        for(int j=i+1;j<4;j++)
	        {
	            if((Course[i].handson)>(Course[j].handson))
	            {
	                val=obj[i];
	                obj[i]=obj[j];
	                obj[j]=val;
	            }
	        }
	    }
	    if(obj.length!=0)
	    return obj;
	    else
	    return null;
	}

}

class Course
{
    int courseid;
    String coursename;
    String courseadmin;
    int quiz;
    int handson;
    Course(int courseid,String coursename,String courseadmin,int quiz,int handson)
    {
        this.courseid=courseid;
        this.coursename=coursename;
        this.courseadmin=courseadmin;
        this.quiz=quiz;
        this.handson=handson;
    }
}