
public class MergeToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Pravin";
		String p="Chavan";
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < p.length(); j++) {
				System.out.print(s.charAt(i)+""+p.charAt(i));
				break;
			}
			
		}

	}

}
