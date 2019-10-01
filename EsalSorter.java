package sorting1;

import java.util.Comparator;

public class EsalSorter implements Comparator<EmpPojo>{

	@Override
	public int compare(EmpPojo e1, EmpPojo e2) {
		// TODO Auto-generated method stub
		
		if(e1.getEsal()>e2.getEsal())
			return 1;
		else 
		return -1;
	}
	

}
