import java.util.*;
public class a43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loop,n;
		String name;
		System.out.println("Enter name:");
		Scanner obj=new Scanner(System.in);
		name=obj.nextLine();
		System.out.println("Enter Number times to repeat name");
		n=obj.nextInt ();
		for(int i=0;i<n;i++){
			System.out.println(name);
		}

	}

}
