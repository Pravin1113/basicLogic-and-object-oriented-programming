package collection;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.LinkedList<String> fruit=new java.util.LinkedList<String>();
		fruit.add("apple");
		   fruit.add("mango");
		   fruit.add("chiku");
		   
		   
//		   Iterator itr=fruit.iterator();
//		   while(itr.hasNext()) {
//			   System.out.println(itr.next());
//			   
//		   }
	   fruit.add(2, "banana");
	   for (String string : fruit) {
		   System.out.println(string);
	   }
			
		
		   fruit.remove("banana");
		   for (String string : fruit) {
			   System.out.println(string);
			
		}
		    
	}

}
