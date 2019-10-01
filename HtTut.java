import java.util.Enumeration;
import java.util.Hashtable;

public class HtTut {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(23, "abc");
		ht.put(45, "pqr");
		ht.put(63, "lmn");
		
		
		System.out.println(ht);
		
		Enumeration<Integer> e1=ht.keys();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		Enumeration<String> e2=ht.elements();
		while(e2.hasMoreElements())
		{
			System.out.println(e2.nextElement());
		}
		

	}

}
