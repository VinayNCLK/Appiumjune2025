package day7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("2025-6-24");
		
		 Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("yyyy-M-dd");

	     // System.out.println(ft.format(dNow));
	      
	      Calendar calendar = Calendar.getInstance();
	      Date today = calendar.getTime();

	      calendar.add(Calendar.DAY_OF_YEAR, 1);
	      Date tomorrow = calendar.getTime();
	      
	      SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

	      String todayAsString = dateFormat.format(today);
	      String tomorrowAsString = dateFormat.format(tomorrow);
	      System.out.println(todayAsString);
	      System.out.println(tomorrowAsString);

	}

}
