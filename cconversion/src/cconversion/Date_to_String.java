package cconversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Date d=Calendar.getInstance().getTime();
          DateFormat  f=new SimpleDateFormat("yyyy/mm/dd/ hh:mm:ss");
          String s=f.format(d);
          System.out.println("converted String"+s);
	}

}
