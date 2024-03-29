
public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello ok good bye jko";
		String ss[]=str.split(" ");
		for (int i = 0; i < ss.length/2; i++) {
			String s1=ss[i];
			     ss[i]=ss[ss.length-i-1];
			     ss[ss.length-i-1]=s1;
			
		}
		for (int i = 0; i < ss.length; i++) {
			System.out.print(" "+ss[i]);
			
		}

	}

}
