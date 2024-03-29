package cconversion;
import java.text.SimpleDateFormat;
import java.util.Date;


public class String_to_date {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
  String s="31/12/2000";
   Date s1= new SimpleDateFormat("dd/mm/yyyy").parse(s);
   System.out.println(s+"\t"+s1);
	}

}
