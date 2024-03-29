
public class ReverseEachWord {

	public static void main(String[] args) {
		
		String input= "pravin nitin chavan";
		String[] words=input.split(" ");
		
		for (String str : words) {
			
			for (int i = str.length()-1; i >=0; i--) {
				System.out.print(str.charAt(i)+"");
				
			}
			
			
			
		}
		
	}

}



