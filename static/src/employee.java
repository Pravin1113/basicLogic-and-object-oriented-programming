
public class employee {

	int id;
	String name;
	static String clg="sgm";
	
	public employee( int id,String name) {
		this.id=id;
		this.name=name;
		
		}
	void show() {
		System.out.println("id="+id+"name="+name+"clg="+clg);
	}
	public static void main(String args[]) {
		employee e1=new employee(1, "pravin");
		e1.show();
		employee e2=new employee(2, "akash");
		e2.show();
	}
}
