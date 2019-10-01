import java.util.HashMap;

public class HmTut {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(null, null);
		hm.put(21, "aa");
		hm.put(15, "pp");
		
		System.out.println(hm);

	}

}
