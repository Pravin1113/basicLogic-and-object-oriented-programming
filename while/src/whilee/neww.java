package whilee;
import java.util.Scanner;
class Student{
int id;
String name;
Student(int id,String name){
    this.id = id;
    this.name = name;
}
void display(){
    System.out.println(" Id is "+id+" name of student is "+name);
    }
}
class X_student extends Student{
double salary;
String cname;
X_student(int id,String name,String cname,double salary){
    super(id,name);
    this.cname = cname;
    this.salary = salary;
}
void Show(){
    System.out.println("cname is "+cname+" salary is "+salary);
}
}
public class neww{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name,cname;
        double salary;
        System.out.println("Enter student id and name: ");
        id = sc.nextInt();
        name = sc.next();
        System.out.println("Enter cname and salary: ");
        cname = sc.next();
        salary = sc.nextDouble();
        X_student x1 = new X_student(id,name,cname,salary);
        x1.display();
        x1.Show();
    }
}


