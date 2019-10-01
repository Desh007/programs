import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class UserMap {

	public static void main(String[] args) {
		
	     LinkedHashMap<Integer, String> empmap=new LinkedHashMap<Integer,String>();
	     Scanner sc=new Scanner(System.in);
	     
	     System.out.println("enter no of emp");
	     int n=sc.nextInt();
	     
	     for(int i=0;i<n;i++)
	     {
	    	 
	    	 System.out.println("enter emp id");
	    	 int eid=sc.nextInt();
	    	 System.out.println("enter emp name");
	    	 String ename=sc.next();
	    	 
	    	 empmap.put(eid, ename);
	     }
	     
	     System.out.println(empmap);
	     
	     Set<Integer> set=empmap.keySet();
	     
	     Iterator<Integer> i=set.iterator();
	     
	     while(i.hasNext())
	     {
	    	 int key=i.next();
	    	 String value=empmap.get(key);
	    	 
	    	 System.out.println(key+"\t"+value);
	     }
	}

}
