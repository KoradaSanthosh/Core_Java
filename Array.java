package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
	   public static void main(String[] args) {

	      ArrayList<Integer> arrlist = new ArrayList<Integer>();
	      arrlist.add(28);
	      arrlist.add(14);
	      arrlist.add(78);
	      arrlist.add(80);

	      /* For Loop for iterating ArrayList */
	      System.out.println("For Loop");
	      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
	          System.out.println(arrlist.get(counter)); 		
	      }   		

	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop"); 		
	      for (Integer num : arrlist) { 		      
	           System.out.println(num); 		
	      }

	      /* While Loop for iterating ArrayList*/ 		
	      System.out.println("While Loop"); 		
	      int count = 0; 		
	      while (arrlist.size() > count) {
		 System.out.println(arrlist.get(count));
	         count++;
	      }

	      /*Looping Array List using Iterator*/
	      System.out.println("Iterator");
	      Iterator<Integer> iter = arrlist.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());
	      }
	   }
	}
