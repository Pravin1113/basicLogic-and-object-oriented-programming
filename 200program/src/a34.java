import java.util.*;
public class a34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ge,ms;
		int age;
		System.out.println("Enter marital status(M/N):");
		Scanner obj = new Scanner(System.in);
		ms = obj.next(). charAt(0);
		System.out.println("Enter Gender(M/F):");
		ge = obj.next(). charAt(0);
		System.out.println("Enter Age:\n");
		age= obj.nextInt();
		if (ms=='M')
		{
		System.out.println ("The driver is insured");
		}
		else if (ge=='M' && age>30 && ms=='N')
		{
		System.out.println ("Driver is insured");
		}
		else if (ge=='F' && age>25 && ms=='N')
		{
		System.out.println ("Driver is insured");
		}
		else
		{
		System.out.println ("Driver is not insured");
		}
		
	}

}
