import java.util.Scanner;
public class a51
{
public static void main(String args[])
{
int i,j,r,c;
System.out.println("Enter rows and columns:");
Scanner obj=new Scanner(System.in);
r=obj.nextInt();
c=obj.nextInt();
int a[][]=new int [r][c];
System.out.println("Enter elements of a matrix:");
for(i=0;i< r;i++)
{
for(j=0;j < c;j++)
{
a[i][j]=obj.nextInt();
}
}
System.out.println("The 3*3 Matrix is:");
for ( i=0;i< r;i++ )
{
for (j=0;j< c;j++)
{
System.out.print(a[i][j]+"\t");
if (j==(r-1))
System.out.println("\n");
}
}
}
}
