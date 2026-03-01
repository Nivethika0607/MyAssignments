package Week4.day1;


import java.util.LinkedHashSet;
import java.util.Set;

public class HomeassignmentSetInterface {

	public static void main(String[] args) {
		 
		String companyName = "google";
		System.out.println(companyName);
	
      
		
       Set<Character> cn = new LinkedHashSet<Character>();
      
       for( Character each :  companyName.toCharArray()) {
                cn.add(each);
                System.out.println(cn);
		}
	}
}


