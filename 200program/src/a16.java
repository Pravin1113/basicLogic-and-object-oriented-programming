import java.util.Scanner;
public class a16 {

	
	
	
	public static void main(String arg[])
	{
	int x1,x2,y1,y2,x,y;
	double distance;
	System.out.println("Enter x1 point" );
	Scanner obj=new Scanner(System.in);
	x1=obj.nextInt();
	System.out.println("Enter x2 point" );
	x2=obj.nextInt();
	System.out.println("Enter y1 point");
	y1=obj.nextInt();
	System.out.println("Enter y2 point");
	y2=obj.nextInt();
	x=x2-x1;
	y=y2-y1;
	//Distance formula
	distance=Math.sqrt((x*x )+ (y*y));
	System.out.println("Distance:"+"("+x1+","+x2+"), "+"("+y1+","+y2+")===>"+distance);
	}

	

}
