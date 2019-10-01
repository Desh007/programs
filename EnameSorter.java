package sorting1;

import java.util.Comparator;

public class EnameSorter implements Comparator<EmpPojo>{

	@Override
	public int compare(EmpPojo e1, EmpPojo e2) {
		// TODO Auto-generated method stub
		int i=e1.getEname().compareTo(e2.getEname());
		if(i>0)
			return 1;
		else if(i<0)
			return -1;
		else
		return 0;
	}

}
