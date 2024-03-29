
//To Check a given number is Automorphic or Not
import java.util.Scanner;
public class a59
{
public static void main(String[] args)
{
int n, sqrnum, temp,remainder,c = 0;
System.out.print("Enter number=\n");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
temp=n;
while (temp > 0)
{
temp=temp/10;
c++;
}
sqrnum = n * n;
remainder= sqrnum%(int)Math.pow(10, c);
if(remainder==n)
{
System.out.println("Automorphic Number");
}
else
{
System.out.println("Not Automorphic Number");
}
}
}