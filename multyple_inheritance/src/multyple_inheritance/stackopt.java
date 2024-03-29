package multyple_inheritance;
import java.util.Scanner;

interface StackOp{
    void push();
    void pop();
    void peek();
    void isEmpty();
}
class Mystack implements StackOp{
    int n=10,top=-1,num;
    int [] arr = new int[n];
    @Override
    public void push() {
        Scanner sc = new Scanner(System.in);
        if(top>=n-1){
            System.out.println("Stack OverFlow");
        }else {
            System.out.println("Enter number :");
            num = sc.nextInt();
            top++;
            arr[top] = num;
        }
    }

    @Override
    public void pop() {
        if(top<=-1){
            System.out.println("Stack UnderFlow");
        }else {
            System.out.println("The popped element is "+arr[top]);
            top--;
        }
    }

    @Override
    public void peek() {
        if(top<=-1){
            System.out.println("Stack UnderFlow");
        }else {
            System.out.println(arr[top]);
        }
    }

    void display(){
        if(top>=0){
            System.out.println("Stack elements are : ");
            for (int i = top; i >= 0 ; i--) {
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");
        }
    }

    @Override
    public void isEmpty() {
        if(top<=-1){
            System.out.println("Stack is Empty");
        }else {
            System.out.println("Stack is Not Empty");
        }
    }
}
public class stackopt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        Mystack m1 = new Mystack();
        do{
            System.out.println("Stack Operations");
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Is Empty\n6.Exit");
            ch = sc.nextInt();
            switch (ch){
                case 1 :{
                    m1.push();
                }
                case 2 :{
                    m1.pop();
                }
                case 3 :{
                    m1.peek();
                }
                case 4 :{
                    m1.display();
                }
                case 5 :{
                    m1.isEmpty();
                }
                case 6 :{
                    System.out.println("Exit");
                }
                default : {
                    System.out.println("Enter proper choice");
                }
            }

        }while (ch != 6);
    }
}

