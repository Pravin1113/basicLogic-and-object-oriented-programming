package inheritance;



import java.util.Scanner;
class sttnt{
	int id;String name;
	sttnt(int id,String name){
		
		this.id=id;
		this.name=name;
		
	}
	void display(){
		
		System.out.println("id="+id);
		System.out.println("name="+name);
		
	}
}
    class componny extends sttnt{
    	
		String cname;double salery;
    	componny(int id,String name,String cname,double salery){
    	
    		super (id,name);
    		this.cname=cname;
    		this.salery=salery;
    		    		
    	}
    	void show(){
    		System.out.println("cname="+cname);
    		System.out.println("salery="+salery);
    	}
    	
    }
public class sallery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;String name,cname;double salery;int n,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no of student");
		n=sc.nextInt();
		
		componny c1[]=new componny[n];
		
		
		for( i=0;i<n;i++){
			System.out.println("enter value of student ");
			id=sc.nextInt();
			name=sc.next();
			cname=sc.next();
			salery=sc.nextDouble();
			
	
	  c1[i]=new componny(id,name,cname,salery);
		
		c1[i].display();
		c1[i].show();
		}
		
	}



}
