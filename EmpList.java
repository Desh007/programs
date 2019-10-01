package sorting;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class EmpList {

	public static void main(String[] args) {
		
		Vector<EmpPojo> v=new Vector<EmpPojo>();
		
		EmpPojo e1=new EmpPojo(12, "aa", 55);
		EmpPojo e2=new EmpPojo(2, "ss", 99);
		EmpPojo e3=new EmpPojo(22, "rr", 44);
		
		v.add(e1);
		v.add(e2);
		v.add(e3);
		
		Iterator<EmpPojo> i=v.iterator();
		
		while(i.hasNext())
		{
			
			EmpPojo e=i.next();
			System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsal());
		}
		
		Collections.sort(v);
System.out.println("after sorting");
Iterator<EmpPojo> i2=v.iterator();
		
		while(i2.hasNext())
		{
			
			EmpPojo e=i2.next();
			System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEsal());
		}
	}

}
