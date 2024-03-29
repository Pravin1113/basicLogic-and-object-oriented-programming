//To find the Sum of even and Product of odd digits of given numbers
import java.util.Scanner;
public class a63
{
public static void main(String[] args)
{
int n, even = 0, odd = 0;
System.out.print("Enter the number of elements in array:\n" );
Scanner obj = new Scanner(System.in);
n = obj.nextInt();
int[] a = new int[n];
System.out.println("Enter the elements of the array:\n");
for(int i = 0; i < n; i++)
{
a[i] = obj.nextInt();
}
for(int i = 0; i < n; i++)
{
if(a[i] % 2 == 0)
{
even = even + a[i];
}
else
{
odd = odd + a[i];
}
}
System.out.println("Sum of Even Numbers:"+even);
System.out.println("Sum of Odd Numbers:"+odd);
}
}
