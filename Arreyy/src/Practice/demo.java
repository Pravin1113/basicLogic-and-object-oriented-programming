package Practice;

import java.util.ArrayList;

class p{
	int id;String name;float marks;

	public p(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
	
	System.out.println(marks);

	}
}
class demo{
	public static void main(String[] args) {
		
		ArrayList<p> s=new ArrayList<p>();
		s.add(new p(2, "pravin", 6486));
		s.add(new p(2, "pravin", 3466));
		s.add(new p(2, "pravin", 3486));
		float hig=0;
		for (p p1 : s) {
		
			if (p1.marks>=hig) {
				hig=p1.marks;
			}
			
		}
		System.out.println("higjest Salary is "+hig);
	    }
}