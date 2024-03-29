// Remove Duplicate OR Repeated Number in java
import java.util.Scanner;
public class a48
{
public static void main(String[] args )
{
int a,b,i;
int[] arr = new int[20];
System.out.print("Enter array size: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

for(i=0;i< n;++i)
{
arr[i] = sc.nextInt();
}
for(i=0;i< n;++i)
{
System.out.println(arr[i]);
}
System.out.println("After removing duplicate element array are:\n");
for(a=0;a< n;++a)
{
for(b=a+1;b< n;)
{
if(arr[a] == arr[b])
{
for(int temp = b; temp< n; ++temp)
{
arr[temp] = arr[temp+1];
}
n = n-1;
}
else
b++;
}
}
/* Loop to display array after removing duplicate element */
for(i=0;i< n;++i)
System.out.println(arr[i]);
}
}