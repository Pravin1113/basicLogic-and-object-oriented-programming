package collection;

import java.util.HashMap;
import java.util.Map;

class book{
	int id,quantity;
	String name,author,publisher;
	public book(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
	
}






public class HashmapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Map<Integer, book> books=new HashMap<>();
		book b1=new book(101,"c","pravin","BPB",8);
		book b2=new book(102,"java","ravi","BPB",8);
		book b3=new book(103,"c++","avi","BPB",8);
        books.put(1, b1);
        books.put(2, b2);
        books.put(3, b3);
        for (Map.Entry<Integer, book> entry : books.entrySet()) {
			Integer key = entry.getKey();
			book b = entry.getValue();
			 System.out.println(key+"details:");
			 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity+" ");
			
		}
	}

}
