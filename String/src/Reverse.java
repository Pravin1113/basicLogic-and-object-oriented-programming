
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="nitin";
		String p="";
		
		for (int i = s.length()-1; i>=0; i--) {
			p=p+s.charAt(i);
			
			
			
		}
		if(s.equals(p)==true) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		
		
	}

}
