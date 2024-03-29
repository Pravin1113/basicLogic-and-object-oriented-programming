package inheritance;
import java.util.Scanner;
class Employee1{
    int id;
    long dob;
    String name;
    Employee1(int id,String name,long dob){
    this.dob = dob;
    this.name = name;
    this.id = id;
    }
}
class Manager1 extends Employee1{
    long jd;
    String dname;
    Manager1(int id,String name,long dob,long jd,String dname){
     super(id, name, dob);
      this.jd = jd;
      this.dname = dname;
    }
    void Display(){
        System.out.println("Id is "+id+" name is "+name+" dob is "+dob+" jd is "+jd+" dname is "+dname);
    }
}
public class empolyee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,id;
        long jd,dob;
        String dname,name;
        System.out.println("Enter number of employees: ");
        n = sc.nextInt();
        Manager1[] mg1 = new Manager1[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter id , name and dob");
            id = sc.nextInt();
            name = sc.next();
            dob = sc.nextLong();
            System.out.println("Enter jd and dname");
            jd = sc.nextLong();
            dname = sc.next();
            mg1[i] = new Manager1(id,name,dob,jd,dname);
            mg1[i].Display();
        }
    }
}


